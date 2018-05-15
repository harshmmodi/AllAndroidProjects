package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Digital_Logic extends AppCompatActivity {
    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital__logic);

        lv = (ListView)findViewById(R.id.lvDL);
        list.add("Introduction :\n" +
                "Digital Systems and their evolution. Number system(s) for digital operation- Decimal,\n" +
                "Binary, Octal, Hexadecimal. Number base conversion, Binary codes for decimal digits\n" +
                "and code conversion. Error detecting codes- Parity and Hamming codes. Other coding\n" +
                "systems - Seven segment code, Alpha Numeric codes like ASCII, EBCDIC, ISCII and\n" +
                "Unicode.\n");
        list.add("Digital Arithmetic:\n" +
                "Addition and subtraction of unsigned binary numbers. Complement arithmetic; n’s\n" +
                "complement and (n-1)’s complement. Representation of signed binary numbers ; signmagnitude,\n" +
                "sign-1’s complement and sign-2’s complement, Addition and subtraction of\n" +
                "signed binary numbers. Other binary arithmetic- BCD, NBCD, Excess-3 BCD.\n");
        list.add("Fixed and Floating point representation of numbers - Decimal, Binary. Floating point\n" +
                "arithmetic for signed and unsigned numbers.\n");
        list.add("Boolean Algebra:\n" +
                "Truth table, logic operations- AND, OR, NOT, NAND, NOR, Ex-OR, Ex-NOR. De\n" +
                "Morgan’s theorem. Minimization of Boolean functions - Karnaugh Veitch map method\n" +
                "and Quine-McCluskey’s method. Digital Logic Gates.\n");
        list.add("Combinational logic circuit design:\n" +
                "Half-adder, Full-adder, Encoder, Decoder, Multiplexer, de-multiplexer, parity generator, parity\n" +
                "checker, priority encoder, magnitude comparator.\n");
        list.add("Sequential logic circuit design:\n" +
                "Flip-flops - SR, JK, Master slave JK, D and T. Registers- serial-in-serial-out, serial-inparallel-\n" +
                "out, parallel-in-serial-out, shift registers, circulating shift registers and their\n" +
                "applications. Counters - Synchronous, asynchronous, up, down and modulo-n.\n" +
                "Finite state machines (FSM) - state table, state diagram, Mealy and Moore machines,\n" +
                "state minimization, implementation with flip-flops.\n");
        list.add("Suggested Readings:\n" +
                "1. M. Moris Mano, “ Digital System Design”, Prentice Hall, New Delhi.\n" +
                "2. R.F.Tinder, “Engineering Digital Design, Academic Press, Harcourt India Pvt. Ltd.\n" +
                "3. A.B.Marcovitz, “ Introduction to Logic design”, Tata –McGraw-Hill Edition.\n" +
                "4. B. Vranesic, “ Fundamentals of Digital Logic with VHDL Design”, Tata-Mc-Graw-Hill\n" +
                "Edition.\n" +
                "5. Basu, Nasipuri and Kundu, “Computer Systems and Data Analysis”, Narosa, New Delhi.\n" +
                "6. A. P. Malvino “Digital Principles and Applications”, McGraw Hill International\n" +
                "Editions(Fourth Edition).\n");

        adapter = new ArrayAdapter(Digital_Logic.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);


    }
}
