package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Maths_I extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths__i);

        lv = (ListView)findViewById(R.id.lvM1);
        list.add("Set Theory:\n Review of set theory basics, Partially ordered sets, Lattice, Equivalence relations and\n" +
                "induced partitions, Countable and uncountable sets and their properties. Reordered sets. Least\n" +
                "upper bound property. Statement of real number system as an ordered field with least upper\n" +
                "bound property. Rational numbers. Algebraic and transcendental numbers. Infinite decimal\n" +
                "expansion of real numbers. Cantor’s diagonalisation method for uncountability of real numbers.\n");
        list.add("Introduction to Mathematical Logic.\n");
        list.add("Permutations, their parity and cycle structure.\n");
        list.add("Geometry of three dimension and vector algebra:\n Cartesian Co-ordinates in three dimension,\n" +
                "Position vectors, Addition of vectors, Multiplication of a vector by a scalar, Division of a line\n" +
                "segment in a given ratio, Rectangular resolution of vectors, Direction cosines, Scalar and vector\n" +
                "product of two vectors, Equations of planes and straight lines, Shortest distance between two\n" +
                "skew lines, Product of three vectors, Volume of a tetrahedron, Equation of sphere, cylinder and\n" +
                "cone, Application of mechanics.\n");

        adapter = new ArrayAdapter(Maths_I.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
