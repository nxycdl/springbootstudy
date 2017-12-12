package com.example.demo.modal;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017-11-25.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String name;
    private String address;
    private String email;

    private String password;
    private BigDecimal amount;
    private BigDecimal balance;
    private Integer point;
    private Integer member_rank_id;
    private String register_ip;
    private Integer is_enabled;
    private Integer is_locked;
    private Integer login_failure_count;
    private Integer delete_flag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getMember_rank_id() {
        return member_rank_id;
    }

    public void setMember_rank_id(Integer member_rank_id) {
        this.member_rank_id = member_rank_id;
    }

    public String getRegister_ip() {
        return register_ip;
    }

    public void setRegister_ip(String register_ip) {
        this.register_ip = register_ip;
    }

    public Integer getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Integer is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Integer getIs_locked() {
        return is_locked;
    }

    public void setIs_locked(Integer is_locked) {
        this.is_locked = is_locked;
    }

    public Integer getLogin_failure_count() {
        return login_failure_count;
    }

    public void setLogin_failure_count(Integer login_failure_count) {
        this.login_failure_count = login_failure_count;
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public User() {
    }
}
