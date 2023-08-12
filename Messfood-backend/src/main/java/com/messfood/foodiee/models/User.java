package com.messfood.foodiee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name="user")
public class User {
    @Id
    private int user_id;
    private String UNIQUEID;

    private String email;
    private String password;
    private Date created_at;
    @Transient
    private Date updated_at;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUNIQUEID() {
        return UNIQUEID;
    }

    public void setUNIQUEID(String UNIQUEID) {
        this.UNIQUEID = UNIQUEID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
