package com.example.androidtask2.Data;

import com.example.androidtask2.R;

import java.util.ArrayList;
import java.util.List;

public class TabContent {

    public int id;
    public int image;
    public String courseText;
    public static ArrayList<TabContent> coursesData;

    public TabContent(int id, int image, String courseText){
        this.id = id;
        this.image = image;
        this.courseText = courseText;
    }
    public static String getCourseText(int index){
        return coursesData.get(index).courseText;
    }
    public static int getImage(int index){
        return coursesData.get(index).image;
    }

      static public ArrayList<TabContent>  getCoursesTabData(){

        ArrayList<TabContent> displayData = new ArrayList<>();

        displayData.add(new TabContent(1, R.drawable.android_course , "Android Course"));

        displayData.add(new TabContent(2, R.drawable.ios_course , "IOS Course"));

        displayData.add(new TabContent(3, R.drawable.fullstack_course , "Full Stack Course"));

        return displayData;
    }
}


