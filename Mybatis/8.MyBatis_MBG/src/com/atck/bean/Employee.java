package com.atck.bean;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.id
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.empname
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    private String empname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.gender
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.email
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.login_account
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    private String loginAccount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.id
     *
     * @return the value of t_employee.id
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.id
     *
     * @param id the value for t_employee.id
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.empname
     *
     * @return the value of t_employee.empname
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.empname
     *
     * @param empname the value for t_employee.empname
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.gender
     *
     * @return the value of t_employee.gender
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.gender
     *
     * @param gender the value for t_employee.gender
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.email
     *
     * @return the value of t_employee.email
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.email
     *
     * @param email the value for t_employee.email
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.login_account
     *
     * @return the value of t_employee.login_account
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.login_account
     *
     * @param loginAccount the value for t_employee.login_account
     *
     * @mbggenerated Mon Aug 02 15:15:08 CST 2021
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }
}