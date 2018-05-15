package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OOP extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop);

        lv = (ListView)findViewById(R.id.lvOOP);
        list.add("Introduction to object oriented programming concept\n");
        list.add("C++:\n" +
                "Overview of Procedural Feature: Concept of Reference variable, Default Parameters to\n" +
                "Function, Function overloading\n" +
                "Fundamental Object Oriented Features:\n" +
                "Class and Object, Abstraction/ Encapsulation, Access Specifier \n" +
                "Static Members, Friend Function \n" +
                "Constructor and Destructor \n" +
                "Operator Overloading \n" +
                "Inheritance \n" +
                "Abstract Class, Run time polymorphism, Virtual Base Class [2L]\n" +
                "File Handling \n" +
                "Exception Handling \n" +
                "Class Template and Function Template\n");
        list.add("JAVA:\n" +
                "Introduction: Features of Java, JVM, Concepts of Java Application and Applet \n" +
                "Fundamental Object Oriented Features:\n" +
                "Class and Object, Access Specifier, Static Members, Constructor, Garbage Collector\n" +
                "\n" +
                "Function overloading, Inheritance, Runtime Polymorphism, Abstract class [2L]\n" +
                "Package and Interface \n" +
                "Exception Handling \n" +
                "Wrapper Classes \n" +
                "I/O handling \n" +
                "Threads, Communication and Synchronization of threads \n" +
                "Event Driven Programming: AWT/Swing GUI Components, AWT/Swing Events\n" +
                "Design Pattern\n");
        list.add("Suggested Readings:\n" +
                "1. The Complete reference C++ by H. Schildt, McGrawHill\n" +
                "2. Learning C++: A Hands on Approach by Nagler, Jayco Publishing House\n" +
                "3. The C++ Programming Language by Stroustrup, Adisson Wesley\n" +
                "4. Object Oriented Programming in C++ by R. Lafore, SAMS\n" +
                "5. Java 2.0 Complete Reference by H. Schildt, McGrawHill\n" +
                "6. JAVA How to Program by Deitel and Deitel, Prentice Hall\n");

        adapter = new ArrayAdapter(OOP.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
