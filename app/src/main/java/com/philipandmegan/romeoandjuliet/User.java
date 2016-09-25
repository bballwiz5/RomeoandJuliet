package com.philipandmegan.romeoandjuliet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
    public Gender iAmAGender;
    public Gender iSeekAGender;
    String zipCode;
    String birthday;
    String email;
    String password;
    public Education myEdu;
    public Education theirEdu;
    public Set<Race> race;

    public enum Gender {
        MAN, WOMAN
    }

    public enum Education {
        HS, BA, MA, PHD, LESSTHANHS
    }

    public enum Race {
        AMERICAN_INDIAN, ASIAN, BLACK, WHITE, HISPANIC, PACIFIC_ISLANDER, OTHER
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

    public void setMyEdu(Education e) {
        this.myEdu = e;
    }

    public void setTheirEdu(Education e) {
        this.theirEdu = e;
    }

    public void clearRace() {
        this.race = new HashSet<Race>();
    }

    public void addRace(Race r) {
        this.race.add(r);
    }
}
