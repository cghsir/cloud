package com.cghsir.cloud.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class User implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String salt;

    private Date createDate;

    private String status;

    private String isDeleted;

    private String isAdmin;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geUsername() {
        return username;
    }

    public void seUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", createDate=" + createDate +
                ", status='" + status + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                '}';
    }
}