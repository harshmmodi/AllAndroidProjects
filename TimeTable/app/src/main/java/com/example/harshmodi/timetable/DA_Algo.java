package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DA_Algo extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da__algo);

        lv = (ListView)findViewById(R.id.lvDAA);
        list.add("Definition and Characteristics of Algorithms – Role of Algorithms in Computing\n");
        list.add("Notion of Optimality and Satisfiability – Practical Considerations, Deterministic and\n" +
                "Heuristic Algorithms.\n");
        list.add("Performance Analysis – Space Complexity, Time Complexity, Asymptotic Notations,\n" +
                "Recursive functions.\n");
        list.add("Solving Recurrences – Induction, Substitution and Master Theorem\n");
        list.add("Probabilistic and Randomised Algorithms.\n");
        list.add("Methodologies for Design of Algorithms – Divide and Conquer, Dynamic\n" +
                "Programming, Greedy Approach, Back-tracking, Branch and Bound – Domains of\n" +
                "Applicability and relative advantages and disadvantages of these methodologies.\n" +
                "Extensive emphasis to be given on design and analysis of representative algorithms –\n" +
                "e.g. Sorting Algorithms (Insertion Sort, Merge Sort, Heap Sort, Quick Sort ), Horner’s\n" +
                "Method for Evaluation of Polynomials, Matrix Multiplication Problem (Strassen’\n" +
                "Algorithm), Matrix Chain Multiplication Problem, Longest Subsequence Problem,\n" +
                "Cutting Rod Problem, Knapsack Problem, Huffman Code Problem, etc.\n");
        list.add("Graph Algorithms – Representation of Graphs, Breadth-First Search, Depth-First\n" +
                "Search, Topological Sort, Minimal Spanning Trees (Prim’s Algorithm, Kruskal’s\n" +
                "Algorithm), Travelling Salesman Problem, Single-Source Shortest Paths, All-Pairs\n" +
                "Shortest Paths, Maximum Flow.\n");
        list.add("Amortized Analysis\n");
        list.add("NP-Hard and NP-Complete Problems – Non-deterministic Algorithms, Cook’s\n" +
                "Theorem, Introduction to Approximation Algorithms\n");
        list.add("Suggested Readings:\n" +
                "1. Introduction to Algorithms – T.H. Corman, C.E. Leiserson., R.L. Rivest, C. Stein.\n" +
                "2. Fundamentals to Computer Algorithms – E. Horowitz, S. Sahni, S. Rajasekaran.\n" +
                "3. Combinatorial Optimization Algorithms and Complexity – C.H. Papadimitriou, E.\n" +
                "Steiglitz.\n");
        adapter = new ArrayAdapter(DA_Algo.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
