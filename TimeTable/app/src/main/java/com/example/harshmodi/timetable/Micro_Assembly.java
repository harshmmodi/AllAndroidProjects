package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Micro_Assembly extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro__assembly);

        lv = (ListView)findViewById(R.id.lvMPS);
        list.add("Introduction to microprocessor\n" +
                "Basic features of 8085 microprocessors and its addressing modes, 8085 microprocessor\n" +
                "architecture\n");
        list.add("Memory and I/O interfacing\n" +
                "Address decoding, Address aliasing, Memory read and write operations, Timing diagrams,\n" +
                "Memory mapped I/O and I/O mapped I/O\n");
        list.add("Programming of 8085\n" +
                "Instruction Set, Assembly Language Programming and Illustrative examples\n");
        list.add("8085 Interrupt Structure\n");
        list.add("Data Transfer Techniques\n" +
                "Synchronous and Asynchronous modes of data transfer, Interrupt driven I/O, DMA\n");
        list.add("Peripheral Devices\n" +
                "8255 programmable peripheral interface, 8254 programmable counter, 8251 UART\n" +
                "programmable communication interface, 8257 DMA Controller. 8259 Interrupt controller,\n" +
                "8279 Keyboard & display interface. Signal converter and their interfacing techniques- ADC\n" +
                "0809, DAC 0808.\n");
        list.add("Introduction to micro-controller\n" +
                "8051 as an example. Micro-controller architecture, bi-directional data ports, internal ROM\n" +
                "and RAM, counters/timer s, oscillator and clock, serial communication.\n" +
                "8051-register set, memory organization – internal & external, program memory & data\n" +
                "memory, bit addressable memory, and special function registers\n" +
                "Introduction to instruction set of 8051 and assembly language programming\n");
        list.add("Introduction to advanced microprocessors\n" +
                "8086 as an example, 8086Architecture and Internal Resister Set, Brief discussion on\n" +
                "Instruction Set, Min-Max mode, Concept of Co-processor and its interfacing, Brief studies on\n" +
                "Important features of higher processor in the Intel 80X86 family.\n");
        list.add("Suggested Readings\n" +
                "1. R. Gaonkar, “Microprocessor Architecture, Programming and Applications”, 5th Ed.,\n" +
                "Pearson International, 2001.\n" +
                "2. Mazidi, “The 8051 Microcontrollers & Embedded Systems”, Pearson Education Asia\n" +
                "(LPE).\n");

        adapter = new ArrayAdapter(Micro_Assembly.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
