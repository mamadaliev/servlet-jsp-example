package com.example.app.models;

public class User {

    private long id;
    private String name;
    private double score;
    private String email;

    public User(long id, String name, double score, String email) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
