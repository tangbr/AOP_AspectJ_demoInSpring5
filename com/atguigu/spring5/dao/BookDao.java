package com.atguigu.spring5.dao;

import java.util.List;

import com.atguigu.spring5.entity.Book;

public interface BookDao {
	 void add(Book book);

	 void updateBook(Book book);

	 void delete(String id);

	 int selectCount();

	Book findBookInfo(String id);

	List<Book> findAllBook();
//批量添加
	void batchAddBook(List<Object[]> batchArgs);
	//批量修改
	void batchUpdateBook(List<Object[]> batchArgs);
	//批量删除
	void batchDeleteBook(List<Object[]> batchArgs); 
}
