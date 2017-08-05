package com.example.swarathesh60.listviewcustom;

/**
 * Created by swarathesh60 on 5/8/17.
 */

public class Details {
    String author, details, age;

    public Details(String author, String details, String age) {
        this.author = author;
        this.details = details;
        this.age = age;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
