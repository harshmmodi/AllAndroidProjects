package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Maths_V extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths__v);

        lv = (ListView)findViewById(R.id.lvM5);
        list.add("Mathematical Theory of Probability: Basic concepts, Classical and axiomatic approaches, Sample\n" +
                "space and events, Properties of probability functions.\n");
        list.add("Conditional probability and independent events, Concept of random variable, Discrete and\n" +
                "continuous probability density, mass and distribution functions\n");
        list.add("Expectations and moments, Moment generating and characteristic functions, Uniform, binomial,\n" +
                "poisson, exponential and normal distributions, Multi – dimensional random variables and random\n" +
                "vectors, Joint, marginal and conditional probability distributions\n");
        list.add("Functions of random variable and random vector, Linear transformation of random variable and\n" +
                "random vector, Independent random variables, Mean square estimation, Correlation and\n" +
                "regression, Central limit theorem.\n");
        list.add("Introduction to stochastic processes: Markov, stationary and ergodic processes, Correlation\n" +
                "function and power spectral density. Introduction to Queuing Theory: Kendall’s Notations,\n" +
                "M/M/1, M/M/m Queue, effect of bulk arrival.\n");
        adapter = new ArrayAdapter(Maths_V.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
