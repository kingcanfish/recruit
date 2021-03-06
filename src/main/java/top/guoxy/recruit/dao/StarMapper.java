package top.guoxy.recruit.dao;

import org.springframework.stereotype.Repository;
import top.guoxy.recruit.model.Star;

@Repository
public interface StarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int insert(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int insertSelective(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    Star selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int updateByPrimaryKeySelective(Star record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    int updateByPrimaryKey(Star record);
}