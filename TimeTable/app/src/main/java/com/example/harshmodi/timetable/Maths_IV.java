package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Maths_IV extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths__iv);

        lv = (ListView)findViewById(R.id.lvM4);
        list.add("Power series:\n uniform convergence, validity of term by term operation and product operation.\n");
        list.add("Fourier series, Euler formulae, Dirichlet’s conditions, even and odd functions, half-range sine\n" +
                "and cosine series\n");
        list.add("Ordinary differential equations – 2nd and higher order, Euler – Cauchy equations, variation of\n" +
                "parameters, ordinary point and regular singular solution of 2nd order linear equations – series\n" +
                "solution, Legendre and Chebycheff’s polynomials\n");
        list.add("Complex analysis: differentiation of complex functions, analytic functions, Cauchy – Reimann\n" +
                "equations, line – integral, Cauchy’s integral formulae, Laurant’s series, singularity, Residue\n" +
                "theorem, contour integration.\n");

        adapter = new ArrayAdapter(Maths_IV.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
