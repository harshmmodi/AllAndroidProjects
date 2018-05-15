package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Comp_Prog extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp__prog);

        lv = (ListView)findViewById(R.id.lvCP);
        list.add("Introduction:\n History of Computing, Evolution of Programming Languages, Compilers,\n" +
                "Interpreters\n");
        list.add("Problem Solving Method:\n Algorithms and Flowcharts\n");
        list.add("Overview of C:\n Brief History of C, C Standards, Structure of a C Program, C Libraries and\n" +
                "Linking, Compiling a C Program\n");
        list.add("Expressions:\n Basic Data Types, Variables, Type Qualifiers, Storage Class Specifiers, Variable\n" +
                "Scopes, Constants, Operators, Operator Precedence, Expression Evaluation, Type Conversion in\n" +
                "Expressions, Type Casting\n");
        list.add("Statements:\n Selection Statements (if, switch-case), Iteration Statements (for loop, while loop, dowhile\n" +
                "loop), Jump Statements (return, goto, break, exit, continue)\n");
        list.add("Console I/O:\n Reading and Writing Characters, Reading and Writing Strings, Formatted Console\n" +
                "I/O\n");
        list.add("Arrays and Strings:\n Single Dimension Arrays, Double Dimension Arrays, Strings, Arrays of\n" +
                "Strings, String Library Functions\n");
        list.add("Functions:\n General Form, Function Prototypes, Parameter Passing Mechanisms, Command Line\n" +
                "Arguments, Recursion\n");
        list.add("Pointers:\n Pointer Variables, Pointer Operators, Pointer Expressions, Pointers and Arrays,\n" +
                "Functions and Pointers, Pointers to Functions, Dynamic Memory Allocation\n");
        list.add("Structures, Unions, Enumerations and Typedef: Structures, Arrays of Structures, Structure\n" +
                "Pointers, Unions, Bit Fields, Enumerations, Typedef\n");
        list.add("File I/O:\n Data Organization, File Operations, Text Files and Binary Files, Random Access\n");
        list.add("The Preprocessor:\n Preprocessor Directives, Macros, Macro vs. Function, File Inclusion,\n" +
                "Conditional Compilation\n");
        list.add("Suggested Readings:\n" +
                "1. C: The Complete Reference, by Herbert Schildt, 4th Edition, Tata McGraw Hill, 2000\n" +
                "2. C Primer Plus by Stephen Prata, 5th Edition, SAMS Publishing, 2005\n" +
                "3. C Programming Language, by Brian W. Kernighan and Dennis M. Ritchi, 2nd Edition,\n" +
                "Pearson Education, 2006\n" +
                "4. C: A Reference Manual by Samuel P. Harbison and Guy L. Steele, 5th Edition, Prentice\n" +
                "Hall, 2003\n" +
                "5. Let Us C by Yashwant Kanetkar, BPB Publications, 9th Edition, 2008\n");
        adapter = new ArrayAdapter(Comp_Prog.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
