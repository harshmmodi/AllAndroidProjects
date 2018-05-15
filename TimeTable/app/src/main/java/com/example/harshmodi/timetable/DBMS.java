package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DBMS extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);

        lv = (ListView)findViewById(R.id.lvDBMS);
        list.add("Introduction: Advantages of DBMS, Various levels of Data Definition and abstraction,\n" +
                "Data Independence \n" +
                "Concepts of Different Database Models, Functional Components of DBMS and Overall\n" +
                "Structure of DBMS\n");
        list.add("Relational Model: Relation, Attribute, Key, Foreign Key and other Relational\n" +
                "Constraints\n");
        list.add("Database Design: ER Diagram, Mapping and Participation Constraints, Weak Entity Set,\n" +
                "Aggregation, Extended ER diagram, Design of Database Tables from ER/EER Diagram\n");
        list.add("Languages: Relation Algebra, Relational Calculus \n" +
                "Structured Query Language\n");
        list.add("Functional Dependency: Concepts of Functional Dependency, Normalization,\n" +
                "Multivalued Dependency\n");
        list.add("Database Storage: Fixed/Variable Length Record, Ordered/Unordered file and\n" +
                "Operations on them\n");
        list.add("Indexing: Primary/Clustering/Secondary/Multilevel Index, B/B+ Tree based Indexing,\n" +
                "Hashing\n");
        list.add("Query Optimization: Search Strategies, Expression level Optimization, Join strategies\n" +
                "Database Security \n" +
                "Case Study: Introduction to Oracle Architecture, PL/SQL, Trigger\n");
        list.add("Transaction and Recovery: Concept of Transaction and its States, Log based Recovery,\n" +
                "Checkpoint\n");
        list.add("Concurrency Control: Lock based Protocol, Time Stamp based Protocol, Recoverable\n" +
                "Schedule etc.\n");
        list.add("Advanced Concepts: Object-oriented database concepts and other query languages\n");
        list.add("Suggested Readings:\n" +
                "1. Fundamentals of Database Systems by E. Navathe, Pearson\n" +
                "2. Database System Concepts by Korth and Silberschatz, McGrawHill\n" +
                "3. Commercial Application Development Using Oracle Developer - 2000 by I.\n" +
                "Bayross, BPB\n");
        adapter = new ArrayAdapter(DBMS.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
