package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Graph extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        lv = (ListView)findViewById(R.id.lvGT);
        list.add("Introduction to Graph Theory\n" +
                "Definitions and Examples, Subgraphs, Complement of a graph, Graph Isomorphism,\n" +
                "Degree, Directed and undirected graphs, weighted and unweighted graphs, dual graph.\n");
        list.add("Path, Cycles, Coloring \n" +
                "Walk, Trail, Path, Cycle, Euler Trails and Circuits, Planar Graphs, Hamilton Paths\n" +
                "and Cycles, Vertex coloring, Edge coloring, Chromatic Polynomials.\n");
        list.add("Trees \n" +
                "Definitions, Properties and Examples, Rooted Trees, Trees and Sorting, Binary\n" +
                "Trees, Weighted Trees and Prefix Codes\n");
        list.add("Graph Algorithms \n" +
                "Graph Traversals, Shortest Path Algorithms, Minimal Spanning Trees – the algorithms of\n" +
                "Kruskal and Prim, Max-flow Min-cut Theorem, Matching.\n");
        list.add("Principle of Inclusion and Exclusion \n" +
                "The Principle of Inclusion and Exclusion, Generalizations of the Principle,\n" +
                "Derangements – Nothing is in its Right Place, Rook Polynomials.\n");
        list.add("Generating Functions \n" +
                "Definition and Examples – Calculational Techniques, Partitions of Integers, The\n" +
                "Exponential Generating Function, The Summation Operator.\n");
        list.add("Recurrence Relations \n" +
                "First Order Linear Recurrence Relation, The Second Order Linear Homogeneous\n" +
                "Recurrence Relation with Constant Coefficients, The Non-homogeneous Recurrence\n" +
                "Relation, Solving Recurrences by Generating Functions, Fibonacci Numbers and\n" +
                "Golden Ratio.\n");
        list.add("References:\n" +
                "1. F. Harary: Graph Theory\n" +
                "2. N. Deo: Graph Theory with Applications to Engineering and Computer Science\n" +
                "3. A. Tucker: Applied Combinatorics\n");

        adapter = new ArrayAdapter(Graph.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
