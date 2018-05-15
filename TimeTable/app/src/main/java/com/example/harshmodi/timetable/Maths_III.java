package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Maths_III extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths__iii);

        lv = (ListView)findViewById(R.id.lvM3);
        list.add("Abstract algebra:\n Definition of Groups, Subgroups and Cyclic groups, Lagrange’s theorem,\n" +
                "Homomorphism, Theorem of group, Permutation group.\n");
        list.add("Rings and subrings, Ideals, Prime ideals, Maximal ideals, Fields, Polynomial rings, Algebraic\n" +
                "exension of field, Existance and construction of finite fields, Galois fields.\n");
        list.add("Linear algebra:\n Vector space, Linear dependence and independence of vectors, Basis and\n" +
                "dimension.\n");
        list.add("Definition of matrix, Algebra of matrices, Row and column operations, Row and column space,\n" +
                "Rank of a matrix, Inverse of a matrix, Solution of a system of linear equations by matrix method,\n" +
                "Eigen values and eigen vector of a matrix, Caley Hamilton theorem, Jordan canonical form.\n");
        adapter = new ArrayAdapter(Maths_III.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
