package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Maths_II extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths__ii);

        lv = (ListView)findViewById(R.id.lvM2);
        list.add("Sequence and infinite series, their convergence and divergence, Cauchy’s general principle of\n" +
                "convergence (statement only), Comparison test, D’Alembert’s ratio test and Cauchy’s root test,\n" +
                "Rearrangement of terms of a series, Power series, Radius of convergence.\n");
        list.add("Successive differentiation, Rolle’s theorem, Mean value theorem, Taylor’s theorem and\n" +
                "Maclaurian’s series, Expansion of elementary function: e, log(1+x), (1+x)m, Sin(x), Cos(x),etc.,\n" +
                "Indeterminate forms, Maxima and Minima, Riemann integration, Definition and properties,\n" +
                "Fundamental theorem of integral calculus, Improper integrals, Gamma and Beta functions, Partial\n" +
                "differentiation.\n");
        list.add("Applications:\n Curvature and asymptotes, Rectification, Quadrature, Volume and surface areas of\n" +
                "solids of revolution\n");
        list.add("Functions of several variables:\n Limit and continuity, Partial derivatives, Differentials, Partial\n" +
                "derivatives of a composite function, Euler’s theorem on homogeneous functions, Implicit\n" +
                "function, Jacobian function, Taylor’s theorem, Maxima & minima and Lagrange’s method.\n");
        adapter = new ArrayAdapter(Maths_II.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
