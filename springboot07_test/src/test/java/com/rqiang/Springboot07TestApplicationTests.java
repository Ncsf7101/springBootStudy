package com.rqiang;

import com.rqiang.Service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //默认省略时, 测试类需要在SpringbootApplication启动类的包或者子包里;
// 否则使用 (classes = Springboot07TestApplication.class) 指定反射类
class Springboot07TestApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        bookService.save();
    }

}
