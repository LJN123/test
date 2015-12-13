package com.example.asus.myapplication4;

/**
 * Created by asus on 2015/12/11.
 */
public class Student {
    private static String name;
    private static int imageId;
    public Student(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    public static String getName() {
        return name;
    }
    public static int getImageId() {
        return imageId;
    }
}
