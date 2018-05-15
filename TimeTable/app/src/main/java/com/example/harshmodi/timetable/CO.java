package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class CO extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co);

        lv = (ListView)findViewById(R.id.lvCO);
        list.add("Fundamentals of Computers\n" +
                "Introduction to Digital Computers\n" +
                "Hardware and Software & their dual nature\n" +
                "Von-Neumann Concept\n" +
                "Role of Operating System and Compiler\n");
        list.add("Instruction Set \n" +
                "Opcode and operand\n" +
                "Instruction formats\n" +
                "Addressing modes and effective address calculation\n" +
                "Instruction decoding and Instruction execution cycle\n");
        list.add("Arithmetic Unit \n" +
                "ANSI representation of data\n" +
                "Signed addition and subtraction\n" +
                "Fast addition, carry-look-ahead adders and carry save adders\n" +
                "Different multiplication techniques for signed numbers, Booth’s Technique\n" +
                "including Bit-pair technique\n" +
                "Binary division techniques. Restoring type and Non-restoring type \n Floating point arithmetic and different rounding techniques\n");
        list.add("Memory Organization \n" +
                "Memory Hierarchy and different access techniques\n" +
                "Main memory and Secondary memory concepts\n" +
                "Memory Interleaving, S-access and C-access organization\n" +
                "Cache Memory, Different mapping techniques and Replacement Algorithms\n" +
                "Virtual memory and implementation using Page map table\n");
        list.add("Control Unit Design \n" +
                "Instruction interpretation and execution\n" +
                "Hardwired control design\n" +
                "Micro-programmed control design\n" +
                "Instruction format design and nano-programming\n");
        list.add("Input Output Organization \n" +
                "I/O interface and drivers\n" +
                "Programmed I/O\n" +
                "Synchronous and Asynchronous I/O transfer\n" +
                "Interrupt driven I/O transfer\n" +
                "Direct Memory Access (DMA)\n" +
                "I/O processor\n");
        list.add("Pipeline Processing \n");
        list.add("Suggested Readings:\n" +
                "1. Computer Organization , Hamacher et.al.\n" +
                "2. Computer Architecture & Organization , J.P. Hayes\n" +
                "3. Computer System Architecture, Morris Mano\n" +
                "4. Computer Organization & Design, P.Pal Chaudhuri\n");
        adapter = new ArrayAdapter(CO.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
