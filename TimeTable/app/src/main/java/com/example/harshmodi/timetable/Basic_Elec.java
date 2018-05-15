package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Basic_Elec extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__elec);

        lv = (ListView)findViewById(R.id.lvBE);
        list.add("Review of P-N junction diodes and bi-polar transistors\n");
        list.add("Introduction to MOS and CMOS FETs, Equivalent circuits of diode, bipolar transistor\n" +
                "and FETs\n");
        list.add("Switching characteristics of diodes and transistors\n");
        list.add("Elementary physics and characteristics of Schottky diodes, P-N-P-N structures and their\n" +
                "applications\n");
        list.add("Application of diodes in rectification, clipping, clamping etc.\n");
        list.add("Basic concepts of voltage and current amplifiers\n");
        list.add("Feedback in amplifiers, R-C oscillators\n");
        list.add("Design of regulated D.C. power supplies\n");
        list.add("Elementary physics of cold cathode displays, LEDs, LCDs, TFTs, OLEDs\n");
        list.add("Opto-isolators, photo-electric and photo-voltaic devices\n");
        list.add("Suggested Readings:\n" +
                "1. Microelectronics by J.Millman and A.Grabel, Tata McGraw Hill.\n" +
                "2. Integrated Electronics by Millman and Halkias, TMH.\n" +
                "3. Foundation of Electronics by D. Chattopadhyay and P.C.Rakshit, Willey India.\n" +
                "4. Semiconductor Devices: Physics and Technology by S.M. Sze, Willey India.\n");

        adapter = new ArrayAdapter(Basic_Elec.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
