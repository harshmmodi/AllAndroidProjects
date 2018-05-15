package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class DSA extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);

        lv = (ListView)findViewById(R.id.lvDSA);
        list.add("Introduction – Data and Information - Program Structures – Abstract Data Type –\n" +
                "Data Structure - Static and Dynamic Data Structures\n");
        list.add("Array as a Data Structure – Representation of Polynomials and Sparse Matrix -\n" +
                "Linear List – Implementation using array\n");
        list.add("Review of Pointers and Functions\n");
        list.add("Linked List – Single and Double Linked List – Applications\n");
        list.add("Concepts of Algorithm Design Techniques – Divide and Conquer – Greedy –\n" +
                "Dynamic Programming – Backtracking – Branch and Bound – Examples\n");
        list.add("Concepts of Algorithm Analysis – Performance Measurement and Analysis –\n" +
                "Time Complexity and Space Complexity – Introduction to Order functions –\n" +
                "Examples of Analysis\n");
        list.add("Searching and Sorting Algorithms – Linear and Binary Search – Sorting –\n" +
                "Insertion, Selection, Merge, Quick, Heap, Bucket – Stable sorting\n");
        list.add("Stack and Queue – Implementations using Arrays and Linked List – Applications\n" +
                "– Expression Evaluation and Conversions\n");
        list.add("Recursion – Types of Recursion – Examples – Implementation using stack\n");
        list.add("Trees – Binary Trees – Binary Search Tree – Balanced Trees – 2-3 Tree – B-Tree\n" +
                "– B+-Tree\n");
        list.add("Graphs – Adjacency Matrix and List – Graph Search Algorithms – Spanning Tree\n" +
                "Algorithms – Shortest Path Algorithms – Transitive Closure Matrix\n");
        list.add("Hashing – Terminologies – Hash functions – Collision Resolution Strategies –\n" +
                "Types of Hashing\n");
        list.add("Suggested Readings:\n" +
                "1. Fundamentals of Data Structures in C by Horowitz, Sahni & Anderson-Freed, 2e\n" +
                "Universal Press\n" +
                "2. Data Structures and Algorithm Analysis in C by Mark Alan Weiss, 2nd ed.,\n" +
                "Pearson Education\n" +
                "3. Data Structues and Algorithms by Aho, Hopcroft & Ullman\n" +
                "4. Data Structures and Program Design by Kruse et. al., PHI\n" +
                "5. Data Structures using C and C++ by Tanenbaum et. al., PHI\n" +
                "6. Fundamentals of Data Structures in C++ by Horowitz, Sahni & Mehta\n" +
                "7. Data Structures in Java by Sahni\n");
        adapter = new ArrayAdapter(DSA.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
