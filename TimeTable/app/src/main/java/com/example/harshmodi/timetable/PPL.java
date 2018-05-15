package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PPL extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppl);

        lv = (ListView)findViewById(R.id.lvPPL);
        list.add("Introduction: programming language definition, brief history of programming\n" +
                "languages, overview of programming paradigms.\n");
        list.add("Language design principles: design criteria, efficiency, regularity.\n");
        list.add("Syntax: lexical structure, Context free grammar, BNF, syntax tree, parse tree, Sexpression\n" +
                "syntax.\n");
        list.add("Semantics: declaration, allocation, evaluation, symbol table, runtime environment, data\n" +
                "types, type checking, weak typing, strong typing, static typing, parameter passing\n" +
                "methods such as pass by value, pass by name, pass by result, pass by value-result, pass by\n" +
                "reference, exceptions and exceptions handling.\n");
        list.add("Garbage collection: advantages, explicit garbage collection, automatic garbage\n" +
                "collection, compacting.\n");
        list.add("Imperative programming: impact of Von Neumann architectures on programming\n" +
                "languages, assignments, names, locations, L- value, R-value, memory allocation, scope\n" +
                "rules, control flow, control abstraction, functions, exception handling, primitive and\n" +
                "constructed data types, data abstraction.\n");
        list.add("Object oriented paradigm: objects, classes, methods, dynamic binding, inheritance,\n" +
                "polymorphism, design and implementation issues in object-oriented languages, case\n" +
                "study.\n");
        list.add("Declarative programming: distinctive features of declarative programming, first order\n" +
                "logic, Horn clauses, resolution unification, sequencing of control, negation,\n" +
                "implementation issues, the language Prolog.\n");
        list.add("Functional programming: distinctive features of functional programming languages,\n" +
                "functional programming in imperative language, recursion, tail recursion, higher order\n" +
                "functions, lazy evaluation, types in functional programming, mathematics of functional\n" +
                "programming: lambda calculus. Introduction to functional programming using\n" +
                "Scheme/Haskell/ML.\n");
        list.add("Brief introduction to multi-paradigm languages (Python/Leda/Ada/C#).\n");
        list.add("Suggested Readings:\n" +
                "1. Kenneth C. Louden, Programming Languages: Principles and Practice, 2003\n" +
                "2. D. A. Watt, Programming Languages and Paradigms, Prentice-Hall, 1990.\n" +
                "3. J. Lloyd, Foundations of Logic Programming, Springer Verlag, 1984.\n" +
                "4. M. Hennessey, The Semantics of Programming Languages, John Wiley, 1990.\n" +
                "5. Luca Cardelli and P. Wegner, On Understanding Types, Data Abstraction and\n" +
                "Polymorphism, Computing Surveys, 17(4), pp 471, 1985.\n" +
                "6. C. Reade, Elements of Functional Programming, Addison Wesley, 1989.\n" +
                "7. Benjamin C. Pierce, ed., Advanced Topics in Types and Programming\n" +
                "Languages, MIT Press, 2005.\n");
        adapter = new ArrayAdapter(PPL.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
