package com.bit.ehcache.EhCachePoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class BookController {
 
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = {"/book"}, method=RequestMethod.GET)
	@ResponseBody
	public List<Book> getAllBook() {
		return bookService.get();
	}
	
	
	@RequestMapping(value = "/book", method=RequestMethod.POST)
	@ResponseBody
	public String saveBook(@RequestBody Book book) {
		bookService.save(book);
		return "saved";
		
	}
	
	@RequestMapping(value = "/book/{bookid}", method=RequestMethod.GET)
	@ResponseBody
	public Book getBook(@PathVariable("bookid") Integer id) {
		 return bookService.get(id);
		
	}
	
	@RequestMapping(value = "/book/{bookid}", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteBook(@PathVariable("bookid") Integer id) {
		 bookService.delete(id);
		 return "book deleted.";		
	}
}