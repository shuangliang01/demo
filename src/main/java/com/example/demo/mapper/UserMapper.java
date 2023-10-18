package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into test (name,account_id,token,gmt_create,gmt_modified, avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from test where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from test where id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from test where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update test set name = #{name}, token = #{token}, gmt_modified = #{gmtModified}, avatar_url = #{avatarUrl} where id = #{id}")
    void update(User user);
}
