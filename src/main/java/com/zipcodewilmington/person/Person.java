package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String favColor;
    private String nickname;

    public String getFavColor() {
        return favColor;
    }

    public String getNickname() {
        return nickname;
    }

    public int getFavoriteNum() {
        return favoriteNum;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private int favoriteNum;
    private boolean isAlive;

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setFavoriteNum(int favoriteNum) {
        this.favoriteNum = favoriteNum;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
