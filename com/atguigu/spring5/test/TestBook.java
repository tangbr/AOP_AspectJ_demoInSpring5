package com.atguigu.spring5.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;

public class TestBook {

	
		@Test
		public void testJdbdTemplate()
		{
			
			  @SuppressWarnings("resource") 
			  ApplicationContext context = 
			  new  ClassPathXmlApplicationContext("bean1.xml"); 
			  BookService bookService =	  context.getBean("bookService", BookService.class); 
//			  //添加 
//			  Book book = new  Book(); 
//			  book.setUserId("1"); 
//			  book.setUsername("java"); 
//			  book.setUstatus("a");
//			  bookService.addBook(book);
//			  
			  //修改 
//			  Book book01 = new Book(); 
//			  book01.setUserId("1");
//			  book01.setUsername("javaupup"); 
//			  book01.setUstatus("atCanada");
//			  bookService.updateBook(book01);
//			  
			  //删除 bookService.deleteBook("1");
			  
			  //查询返回某个值 int count = bookService.findCount(); System.out.println(count);
			  
			  //查询返回对象 Book book02 = bookService.findOne("1"); System.out.println(book02);
			  
			  //查询返回集合 List<Book> all = bookService.findAll(); System.out.println(all);
			 
			
			//批量添加
			List<Object[]> batchArgs = new ArrayList<>();
			Object[] o1 = {"3","java","a"};
			Object[] o2 = {"4","c++","b"};
			Object[] o3 = {"5","python","c"};
			batchArgs.add(o1);
			batchArgs.add(o3);
			//调用批量添加
		bookService.batchAdd(batchArgs);
			
			
			

			//批量修改
//			List<Object[]> batchArgs = new ArrayList<>();
//			Object[] o1 = {"java0909","a3","3"};
//			Object[] o2 = {"c++1010","b4","4"};
//			Object[] o3 = {"python1111","c5","5"};
//			batchArgs.add(o1);
//			batchArgs.add(o2);
//			batchArgs.add(o3);
//			//调用批量修改
//			bookService.batchUpdate(batchArgs);
//			
//			
			
//			//批量删除	
//			List<Object[]> batchArgs = new ArrayList<>();
//			Object[] o1 = {"3"};
//			Object[] o2 = {"4"};
//		//	Object[] o3 = {"5"};
//			batchArgs.add(o1);
//			batchArgs.add(o2);
//	//		batchArgs.add(o3);
//			//调用批量删除
//			bookService.batchDelete(batchArgs);
//			
//			
			
			
			
			
			

		}
}
