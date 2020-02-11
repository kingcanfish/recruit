package top.guoxy.recruit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Freshman implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.sex
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.department
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.introduction
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.phone
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.email
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.clazz
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String clazz;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.status
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.confirm
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Integer confirm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.mark
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private String mark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.time
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freshman.code
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    @JsonIgnore
    private String code;



    private int starCount;

    private int commentCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freshman
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */



    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.id
     *
     * @return the value of freshman.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.id
     *
     * @param id the value for freshman.id
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.name
     *
     * @return the value of freshman.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.name
     *
     * @param name the value for freshman.name
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.sex
     *
     * @return the value of freshman.sex
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.sex
     *
     * @param sex the value for freshman.sex
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.department
     *
     * @return the value of freshman.department
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.department
     *
     * @param department the value for freshman.department
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.introduction
     *
     * @return the value of freshman.introduction
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.introduction
     *
     * @param introduction the value for freshman.introduction
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.phone
     *
     * @return the value of freshman.phone
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.phone
     *
     * @param phone the value for freshman.phone
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.email
     *
     * @return the value of freshman.email
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.email
     *
     * @param email the value for freshman.email
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.clazz
     *
     * @return the value of freshman.clazz
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.clazz
     *
     * @param clazz the value for freshman.clazz
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.status
     *
     * @return the value of freshman.status
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.status
     *
     * @param status the value for freshman.status
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.confirm
     *
     * @return the value of freshman.confirm
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Integer getConfirm() {
        return confirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.confirm
     *
     * @param confirm the value for freshman.confirm
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.mark
     *
     * @return the value of freshman.mark
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.mark
     *
     * @param mark the value for freshman.mark
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.time
     *
     * @return the value of freshman.time
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.time
     *
     * @param time the value for freshman.time
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freshman.code
     *
     * @return the value of freshman.code
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freshman.code
     *
     * @param code the value for freshman.code
     *
     * @mbg.generated Mon Feb 10 13:27:08 CST 2020
     */
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", department='" + department + '\'' +
                ", introduction='" + introduction + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", clazz='" + clazz + '\'' +
                ", status=" + status +
                ", confirm=" + confirm +
                ", mark='" + mark + '\'' +
                ", time=" + time +
                '}';
    }
}