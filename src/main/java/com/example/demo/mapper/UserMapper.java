package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into test (name,account_id,token,gmt_create,gmt_modified, avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from test where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from test where id = #{id}")
    User findById(@Param("id") Integer id);
}
