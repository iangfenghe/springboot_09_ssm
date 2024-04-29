package com.itjiangfeng;

import com.itjiangfeng.domain.Book;
import com.itjiangfeng.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09SsmApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book bookServiceById = bookService.getById(7);
        System.out.println(bookServiceById);
    }
    @Test
    void contextLoads() {
    }

}
