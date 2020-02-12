package top.guoxy.recruit.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import top.guoxy.recruit.dto.FreshmanBasicDto;
import top.guoxy.recruit.model.Freshman;

import java.util.List;

@Component
@Mapper
public interface FreshmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    @Insert("insert into freshman (name, sex, department, introduction, phone, email, clazz, time)  " +
            "values(#{name}, #{sex}, #{department}, #{introduction}, #{phone}, #{email}, #{clazz}, #{time})")
    int insert(Freshman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */

    int insertSelective(Freshman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    @Select("select * from freshman where id = #{id}")
    Freshman selectByPrimaryKey(Integer id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int updateByPrimaryKeySelective(Freshman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int updateByPrimaryKey(Freshman record);
    @Select("select * from freshman where department = #{group}")
    List<FreshmanBasicDto> getFreshmanListByGroup(String group);
}