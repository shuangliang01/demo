package com.example.demo.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.NAME
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.ACCOUNT_ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.TOKEN
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.GMT_CREATE
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.GMT_MODIFIED
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.BIO
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TEST.AVATAR_URL
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.ID
     *
     * @return the value of TEST.ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.ID
     *
     * @param id the value for TEST.ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.NAME
     *
     * @return the value of TEST.NAME
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.NAME
     *
     * @param name the value for TEST.NAME
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.ACCOUNT_ID
     *
     * @return the value of TEST.ACCOUNT_ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.ACCOUNT_ID
     *
     * @param accountId the value for TEST.ACCOUNT_ID
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.TOKEN
     *
     * @return the value of TEST.TOKEN
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.TOKEN
     *
     * @param token the value for TEST.TOKEN
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.GMT_CREATE
     *
     * @return the value of TEST.GMT_CREATE
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.GMT_CREATE
     *
     * @param gmtCreate the value for TEST.GMT_CREATE
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.GMT_MODIFIED
     *
     * @return the value of TEST.GMT_MODIFIED
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.GMT_MODIFIED
     *
     * @param gmtModified the value for TEST.GMT_MODIFIED
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.BIO
     *
     * @return the value of TEST.BIO
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.BIO
     *
     * @param bio the value for TEST.BIO
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TEST.AVATAR_URL
     *
     * @return the value of TEST.AVATAR_URL
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TEST.AVATAR_URL
     *
     * @param avatarUrl the value for TEST.AVATAR_URL
     *
     * @mbg.generated Mon Oct 23 12:17:40 PDT 2023
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}