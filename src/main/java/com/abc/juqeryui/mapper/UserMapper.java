package com.abc.juqeryui.mapper;

import com.abc.juqeryui.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

/**
 * Created by jackl on 2016/5/5.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user order by id desc")
    @Results(value = {
            @Result(property = "createDate", column = "create_date", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP) })
    List<User> findAll();
}
