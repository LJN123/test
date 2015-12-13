package com.example.asus.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Stu_Activity extends AppCompatActivity {
    private List<Student> StudentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list);

        initStudents();
        StudentAdapter adapter = new StudentAdapter(Stu_Activity.this,
                R.layout.activity_stu, StudentList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initStudents() {
        Student stu1 = new Student("小王    大一" ,R.drawable.t012178fad40400e888);
        Student stu2 = new Student("小李     大二",R.drawable.t0136c3491ca4d95322);
        Student stu3 = new Student("小张    大二", R.drawable.t0176da0cf5885d3a4e);
        Student stu4 = new Student("小红   大二", R.drawable.t01ff4bda9ce4f81ec4);
        Student stu5 = new Student("小明    大二",R.drawable.t01ff4bda9ce4f81ec4);
        Student stu6 = new Student("学长   大二", R.drawable.tuscany011);
        Student stu8=new Student("xx   大二",R.drawable.beijiaerhu008);
        Student stu7 = new Student("学姐                                      大二", R.drawable.beijiaerhu008);
        StudentList.add(stu1);
        StudentList.add(stu2);
        StudentList.add(stu3);
        StudentList.add(stu4);
        StudentList.add(stu5);
        StudentList.add(stu6);
        StudentList.add(stu7);
        StudentList.add(stu8);

    }
}
