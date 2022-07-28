package com.atguigu.spring5.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atguigu.spring5.entity.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
		//注入JdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//添加的方法
	@Override
	public void add(Book book) {

		//1. 创建sql 语句
		String sql = "insert into t_book values (?,?,?)";
		
		//2.  调用方法的实现
		Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
		int update = jdbcTemplate.update(sql,args);
//		int update = jdbcTemplate.update(sql,book.getUserId(),book.getUsername(),book.getUstatus());
		System.out.println (update);
	}

	//修改
	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		String sql = "update t_book set username=?, ustatus=? where user_id=?";
		Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId()};
		int update = jdbcTemplate.update(sql, args);
		System.out.println (update);
	}
	//删除
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from t_book where user_id=?";
		int update = jdbcTemplate.update(sql, id);
		System.out.println (update);
	}

		//查询表记录数
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
	
		String sql = "SELECT count(*) FROM t_book";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	//查询返回对象
	@Override
	public Book findBookInfo(String id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM t_book where user_id=?";
		//调用方法
		Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
		return book;
	}

	//查询返回集合
	@Override
	public List<Book> findAllBook() {
	//	jdbcTemplate.batchUpdate(null, null)
		
		
		
		// TODO Auto-generated method stub
		String sql = "select * from t_book";
		//调用方法
		List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
		return bookList;
	}

	//批量添加
	@Override
	public void batchAddBook(List<Object[]> batchArgs) {
			String sql = "insert into t_book values (?,?,?)";
			int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
			System.out.println(Arrays.toString(ints));
	}


	//批量修改
	@Override
	public void batchUpdateBook(List<Object[]> batchArgs) {
		String sql = "update t_book set username=?, ustatus=? where user_id=?";
		int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
		System.out.println(Arrays.toString(ints));	
	}
	//批量删除
	@Override
	public void batchDeleteBook(List<Object[]> batchArgs) {
		// TODO Auto-generated method stub
		String sql = "delete from t_book where user_id=?";
		int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
		System.out.println(Arrays.toString(ints));
	}
}
