package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Automata extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automata);

        lv = (ListView)findViewById(R.id.lvAutomata);
        list.add("Finite Automata \n" +
                "DFA, NFA, Recognition of a language by an automaton, Equivalence of DFA and\n" +
                "NFA, Minimization of FA, Equivalence of FAs\n");
        list.add("Regular Languages\n" +
                "Regular Sets and Languages, Pumping Lemma for Regular Languages, Closure\n" +
                "Properties of Regular Sets, Kleen’s Theorem\n");
        list.add("Context-free Languages and Push-Down Automata\n" +
                "Non-regular languages, CFLs, Closure properties of CFLs, Grammars, Ambiguity, Push-\n" +
                "Down Automata, Normal Forms, Pumping Lemma for CFL.\n");
        list.add("Turing Machines\n" +
                "Introduction to Context Sensitive Languages and Grammars, Turing Machines and its\n" +
                "variants, Universal TMs, Halting Problem, Recursive Functions and Sets, Recursively\n" +
                "Enumerable Sets, Arithmetization of TMs.\n");
        list.add("Complexity Classes \n" +
                "Space and Time Complexity, RAM programs and TMs, PTIME, NP, PSPACE etc.,\n" +
                "Polynomial reducibility.\n");
        list.add("Suggested Readings:\n" +
                "1. Introduction to Automata Theory, Languages and Computation - J. E. Hopcroft\n" +
                "and J. D. Ullman\n" +
                "2. Elements of the Theory of Computation - H. R. Lewis and C. H. Papadimitriou\n" +
                "3. An Introduction to Formal Languages and Automata – Peter Linz, Narosa\n" +
                "4. Introduction to the Theory of Computation – Michael Sipser, Thomson Press\n" +
                "5. Automata and Computability – Dexter C. Kozen, Springer\n");

        adapter = new ArrayAdapter(Automata.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
