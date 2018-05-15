package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Compiler extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);

        lv = (ListView)findViewById(R.id.lvCompiler);
        list.add("Introduction: Programs, interpreters, and translators; Analysis-Synthesis model of\n" +
                "translation; Examples of translators; Structure of a compiler; Issues in compiler design.\n");
        list.add("Programming Language Basics: Syntax, Semantics and Pragmatics; \n" +
                "The static/dynamic distinction, Environments and states, Static scope and block\n" +
                "structures, Explicit access control, Dynamic scope, Parameter passing mechanisms,\n" +
                "Aliasing.\n");
        list.add("Lexical Analysis: Role of a lexical analyzer; Input buffering, Specification of tokens,\n" +
                "Recognition of tokens; Languages, Regular expressions, Regular definitions; Finite\n" +
                "automata, Nondeterministic and deterministic finite automata, Transitions tables,\n" +
                "Acceptance of input strings by automata, Conversion of an NFA to DFA; State-machinedriven\n" +
                "lexical analyzers and their implementations.\n");
        list.add("Syntax Analysis: Role of a parser, Representative grammars, Context-free grammars,\n" +
                "Parse trees, derivations and sentential forms, Ambiguity; \n" +
                "Top down parsing, Predictive and Recursive descent parsing, Elimination of left\n" +
                "recursions, Left factoring, FIRST and FOLLOW sets and their computations, LL(1)\n" +
                "grammars, Error recovery techniques; \n" +
                "Bottom up parsing, Reductions, Handle pruning, Shift reduce parsing; LR parsing,\n" +
                "Implementing the parser as a state machine, viable prefixes, Items and the LR(0)\n" +
                "automaton; Constructing SLR parsing tables: LR(0) grammars, SLR(1) grammars;\n" +
                "Canonical LR(1) items and constructing canonical LR(1) parsing tables; Constructing\n" +
                "LALR parsing tables. \n" +
                "Using Yacc and Lex.\n");
        list.add("Semantics and Semantic Analysis: Syntax-directed translation, Attribute grammars,\n" +
                "Inherited and synthesized attributes, Dependency graphs, Evaluation orders of attributes,\n" +
                "S-Attributed definitions, L-attributed definitions, Syntax-directed translation schemes.\n" +
                "Symbol tables and their relationship to semantic objects; Symbol table implementation:\n" +
                "binary trees vs. hashing.\n");
        list.add("Intermediate Code Generation: Intermediate languages – Declarations – Assignment\n" +
                "Statements – Boolean Expressions – Case Statements – Back patching – Procedure calls.\n");
        list.add("Runtime Environment: Static versus dynamic storage allocation, Names, scopes and\n" +
                "bindings; Object lifetimes; Stack allocation; Access to non-local data on the stack; Heap\n" +
                "management; Garbage collection.\n");
        list.add("Code Optimization: Overview of optimization; Data Flow Analysis; Peephole\n" +
                "Optimizations; Constant Folding, Common Subexpression Elimination, Copy\n" +
                "Propagation, Strength Reduction. Global Optimization: Loop optimizations; Induction\n" +
                "Variable elimination, Optimizing procedure calls – inline and closed procedures.\n" +
                "Machine-Dependent Optimization: Pipelining and Scheduling.\n");
        list.add("Code Generation: Issues in the design of code generator – The target machine,\n" +
                "Construction of executable code and libraries.\n");
        list.add("Suggested Readings:\n" +
                "1. “Compilers – Principles, Techniques, and Tools”; Alfred V. Aho, Monica S. Lam,\n" +
                "Ravi Sethi,\n" +
                "2. Jeffrey D. Ullman; Pearson Education.\n" +
                "3. “Compiler Design in C”, Allen I. Holub, Prentice Hall.\n" +
                "4. “Crafting a compiler with C”, C. N. Fischer and R. J. LeBlanc, Pearson\n" +
                "Education.\n" +
                "5. “Compiler Construction: Principles and Practice”, Kenneth C. Louden, , Thomson\n" +
                "Learning.\n");
        adapter = new ArrayAdapter(Compiler.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
