package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ETech extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etech);

        lv = (ListView)findViewById(R.id.lvETech);
        list.add("DC Circuits: Kirchhoff's Laws. Maxwell's Loop Current Methods of Analysis. Star-Delta\n" +
                "Conversion. Superposition Theorem. Thevenin's Theorem. Maximum Power Transfer.\n");
        list.add("Magnetic Circuit: MMF, Flux ,Reluctance. B-H Loop. Hysteresis and Eddy current loss.\n" +
                "Magnetic circuit analysis with air gap. AC 1 -phase: Periodic Waves and Sinusoids. Average and\n" +
                "RMS Values, Form Factor, Peak. Factor. Phasor concept of Sinusoids. Impedance and\n" +
                "Admittance. Power, Power Factor, V A, V AR. Series R-L-C Circuit ,Parallel R-L-C circuit.\n" +
                "Resonance. Balanced 3-phase: 3-phase AC balanced circuits. Phase-sequence. Star and Delta\n" +
                "connections. Power, V A, V AR, Power Factor _or balanced 3-phase circuits. Power\n" +
                "Measurement: Wattmeter circuit connection. Power Measurement by two wattmeter methods in\n" +
                "3phase system. DC Machines: Construction and general principle of operation. Generator EMF\n" +
                "Equation. Field connection ,shunt series and compound. Generator characteristics.\n");
        list.add("Motor-equation and general operation. starting and speed control, torque -speed curve. 1-\n" +
                "PhaseTransformer: Construction. EMF equation. Phasor diagram. Equivalent circuits. Losses and\n" +
                "Efficiency. Open circuit and Short circuit test. 3-Phase Induction Machine: Types of induction\n" +
                "machines. Rotating magnetic field, slip ,torque equation, torque speed curve.DOL starting and\n" +
                "reduced voltage starting. 3-Phase Synchronous Machines: Alternator, constructional features,\n" +
                "EMF equation, synchronous reactance, power -angle characteristics. Concept of synchronous\n" +
                "motor. Meters: DC and AC Ammeters and Voltmeters. Megger. Multiplier.\n");
        adapter = new ArrayAdapter(ETech.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
