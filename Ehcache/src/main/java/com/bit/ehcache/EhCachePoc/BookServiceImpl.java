package com.bit.ehcache.EhCachePoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class BookServiceImpl implements BookService{
 
	@Autowired
	private BookDAO bookDAO;
	
	@Override
	@Transactional
	public void save(Book book) {
		bookDAO.save(book);
	}
 
	@Override
	@Transactional
	public Book get(int id) {
		return bookDAO.get(id);
	}
 
	@Override
	@Transactional
	public void delete(int id) {
		bookDAO.delete(id);
	}
 
	@Override
	@Transactional
	public List<Book> get() {
		return bookDAO.get();
	}
	
	
}