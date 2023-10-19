package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST
     *
     * @mbg.generated Thu Oct 19 00:06:55 PDT 2023
     */
    int updateByPrimaryKey(User record);
}