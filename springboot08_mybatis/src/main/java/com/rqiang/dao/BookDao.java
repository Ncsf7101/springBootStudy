package com.rqiang.dao;

import com.rqiang.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    
    @Select("select * from tb_Book where id=#{id}")
    public Book getById(Integer id);
}
