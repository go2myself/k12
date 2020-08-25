package com.ls.entity;

import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 16:36
 * @Version 1.0
 */
public class Grade {
    private Integer uid;
    private  Double score;
    private Integer id;
//    private Users user;



    public Grade() {
    }

    public Grade(Integer uid, Double score, Integer id) {
        this.uid = uid;
        this.score = score;
        this.id = id;
    }

//    public Grade(Integer uid, Double score, Integer id, Users user) {
//        this.uid = uid;
//        this.score = score;
//        this.id = id;
//        this.user = user;
//    }

//    public Users getUser() {
//        return user;
//    }
//
//    public void setUser(Users user) {
//        this.user = user;
//    }

    @Override
    public String toString() {
        return "Grade{" +
                "uid=" + uid +
                ", score=" + score +
                '}';
    }

//    public List<Users> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<Users> users) {
//        this.users = users;
//    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
