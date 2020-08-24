package com.ls.entity;

/**
 * @Author liusi
 * @Date 2020/8/24 16:36
 * @Version 1.0
 */
public class Grade {
    private Integer uid;
    private  Double score;
    private Integer id;
    @Override
    public String toString() {
        return "Grade{" +
                "uid=" + uid +
                ", score=" + score +
                '}';
    }

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
