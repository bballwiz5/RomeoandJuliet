package com.philipandmegan.romeoandjuliet;

import java.util.Date;

public class User {
    public Gender iAmAGender;
    public Gender iSeekAGender;
    String zipCode;
    String birthday;
    String email;
    String password;

    public enum Gender {
        MAN, WOMAN
    }

    public User(Gender iAmA, Gender iSeekA) {
        iAmAGender = iAmA;
        iSeekAGender = iSeekA;
    }

    public User() {
        iAmAGender = null;
        iSeekAGender = null;
    }

    public Gender getSeekingGender() {
        return this.iSeekAGender;
    }

    public void setIAmA(Gender g) {
        this.iAmAGender = g;
    }

    public void setISeekA(Gender g) {
        this.iSeekAGender = g;
    }

    public void setZipCode(String z) {
        this.zipCode = z;
    }

    public void setBirthday(String b) {
        this.birthday = b;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setPassword(String p) {
        this.password = p;
    }

}
