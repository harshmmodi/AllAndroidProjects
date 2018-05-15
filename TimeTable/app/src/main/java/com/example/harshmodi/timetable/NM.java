package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class NM extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nm);

        lv = (ListView)findViewById(R.id.lvNM);
        list.add("Approximations and Errors associated with numerical methods.\n");
        list.add("Solution of non-linear equations:\n" +
                "Iterative method using repeated substitutions, Bisection method, method of false position,\n" +
                "Newton-Raphson method, Secant method, Chebyshev method.\n" +
                "Analysis and comparison of these methods.\n");
        list.add("Finding complex roots of a polynomial equation: Lin’s method, Bairstow’s method.\n");
        list.add("Solution of linear simultaneous equations:\n" +
                "Direct methods:\n" +
                "Gaussian elimination, Gauss-Jordan elimination, matrix inversion using Gauss-Jordan\n" +
                "elimination. \n" +
                "Iterative methods:\n" +
                "Jacobi’s method, Gauss-Seidel method and their analysis.\n");
        list.add("Solution of non-linear simultaneous equations:\n" +
                "Iterative method and newton-Raphson method.\n");
        list.add("Finding the eigenvalues and corresponding eigenvectors of a suare matrix:\n" +
                "Definitions of eigenvalues and eigenvectors, Power method for finding the eigenvalues\n" +
                "and corresponding eigenvectors of a square matrix. \n" +
                "Transform methods : Jacobi’s method, Hessenberg’s method.\n");
        list.add("Methods for interpolation:\n" +
                "Newton’s forward difference formula, Newton’s backward difference formula, Gauss\n" +
                "central difference formula. \n" +
                "Divided difference formula, Lagrange’s formula, iterative interpolation method. \n" +
                "Curve fitting: method of least squared error, cubic splines.\n");
        list.add("Methods for differentiation:\n" +
                "Computation of derivatives using Newton’s forward/backward difference formulae.\n");
        list.add("Methods for integration:\n" +
                "Trapezoidal method, Simpson’s method, Boole’s method, analysis and comparison of\n" +
                "these methods, Romberg’s method, Gauss quadrature formula.\n");
        list.add("Solution of differential equations:\n" +
                "Euler’s method, modified Euler’s method, Runge-Kutta 2nd order formula, Runge-Kutta\n" +
                "4th order formula, predictor-corrector methods.\n");
        list.add("Solution of partial differential equations\n");
        list.add("Suggested Readings:\n" +
                "1. Numerical Algorithms by Krishnamoorthy and Sen\n" +
                "2. Numerical Methods by J.H.Mathews, PHI\n" +
                "3. Numerical Analysis and Algorithms by P. Niyogi, TMH\n" +
                "4. Numerical Methods for scientific and engineering computations by Jain, Iyengar\n" +
                "and Jain, New Age International publisher\n" +
                "5. Computer Systems and Data Analysis by D.K.Basu, M.Nasipuri and M.Kundu,\n" +
                "Narosa\n" +
                "6. Introductory Methods of Numerical Analysis by S.S.Sastry , P.H.I.\n");
        adapter = new ArrayAdapter(NM.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
