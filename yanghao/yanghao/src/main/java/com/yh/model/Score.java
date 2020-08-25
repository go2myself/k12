package com.yh.model;

public class Score {
    private int uid;
    private double score;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "uid=" + uid +
                ", score=" + score +
                '}';
    }
}
