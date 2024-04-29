package com.itjiangfeng.service;

import com.itjiangfeng.domain.Book;

import java.util.List;

/**
 * @Author 江峰
 * @Date 2023/11/20 10:21
 * @packageName:com.itjiangfeng.service
 * @ClassName:BookService
 */
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
