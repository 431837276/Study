package com.example.springboot;

import com.example.domain.Book;
import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private BookService bookService;
    @Test
    public void Tgetbyid() {
        Book book = bookService.getById(2);
        System.out.println(book);
    }
    @Test
    public void TgetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

}
