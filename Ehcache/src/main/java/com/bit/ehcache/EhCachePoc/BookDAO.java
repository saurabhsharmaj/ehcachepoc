package com.bit.ehcache.EhCachePoc;

import java.util.List;

public interface BookDAO {
	
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}