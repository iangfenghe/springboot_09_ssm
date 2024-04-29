package com.itjiangfeng.dao;

import com.itjiangfeng.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 江峰
 * @Date 2023/11/20 10:21
 * @packageName:com.itjiangfeng.dao
 * @ClassName:BookDao
 */
@Mapper
public interface BookDao {
    @Insert("insert into ssm_db.tbl_book(type, name, description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update ssm_db.tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);

    @Delete("delete from ssm_db.tbl_book where id=#{id}")
    public int  delete(Integer id);

    @Select("select *from ssm_db.tbl_book where id=#{id}")
    public Book getById(Integer id);

    @Select("select *from ssm_db.tbl_book")
    public List<Book> getAll();
}
