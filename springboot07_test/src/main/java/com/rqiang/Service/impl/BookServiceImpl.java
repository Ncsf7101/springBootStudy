package com.rqiang.Service.impl;

import com.rqiang.Service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("book service is running,,,");
    }
}
