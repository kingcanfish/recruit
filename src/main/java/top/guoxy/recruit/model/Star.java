package top.guoxy.recruit.model;

import java.io.Serializable;

public class Star implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column star.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column star.freshman_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Integer freshmanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column star.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column star.user_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table star
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column star.id
     *
     * @return the value of star.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column star.id
     *
     * @param id the value for star.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column star.freshman_id
     *
     * @return the value of star.freshman_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Integer getFreshmanId() {
        return freshmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column star.freshman_id
     *
     * @param freshmanId the value for star.freshman_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setFreshmanId(Integer freshmanId) {
        this.freshmanId = freshmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column star.name
     *
     * @return the value of star.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column star.name
     *
     * @param name the value for star.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column star.user_id
     *
     * @return the value of star.user_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column star.user_id
     *
     * @param userId the value for star.user_id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}