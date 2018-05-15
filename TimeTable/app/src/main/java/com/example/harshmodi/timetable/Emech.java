package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Emech extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emech);
        lv = (ListView) findViewById(R.id.lvEm);
        list.add("Statics:\n" +
                "Introduction, Idealizations of Mechanics, Fundamentals of Vector Algebra, Application of\n" +
                "Vectors in Mechanics, Equiv System, Equilibrium, FBD Concept, Fundamentals of Friction,\n" +
                "Properties of surface, Centroid, Moment of Inertia\n");
        list.add("Dynamics:\n" +
                "Intro to vector calculus, Definition of vectors in Dynamics, Rectilinear Motion, Curvilinear\n" +
                "motion of particle and description of different coordinate systems, Kinetics, Newton's Law and D'\n" +
                "Alembert's principle and application to rectilinear and curvilinear motion, constrained motion,\n" +
                "Energy and Momentum methods.\n");
        adapter = new ArrayAdapter(Emech.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
