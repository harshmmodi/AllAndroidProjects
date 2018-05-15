package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Circuit_Theory extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuit__theory);

        lv = (ListView)findViewById(R.id.lvCT);
        list.add("Passive circuit parameters and their equilibrium conditions – Kirchoff’s law\n");
        list.add("Differential equation representation of passive circuits\n");
        list.add("Solution of circuit differential equations for simple circuits, concept of impedance and\n" +
                "reactance\n");
        list.add("Steady state response, Frequency domain analysis of RLC circuits, Amplitude and phase,\n" +
                "Vector representation, resonance, circle diagram\n");
        list.add("Network equations,Y-DELTA transforms\n");
        list.add("Network theorems – superposition, reciprocity, Thevenin, Norton, Maximum power\n" +
                "transfer theorems\n");
        list.add("Fourier series and Fourier transform\n");
        list.add("Laplace transform, Solution of circuit differential equations using Laplace transform,\n" +
                "transient and steady state responses\n");
        list.add("Transfer function – concept of poles and zeros – frequency response \n" +
                "Filters – low-pass, High-pass, band-pass and band elimination\n");
        list.add("Basic ideas of characteristic impedance, matching, attenuation and phase distortion in\n" +
                "transmission lines\n");
        list.add("Suggested Readings:\n" +
                "1. Network Analysis by M.E.Van Valkenburg, Prentice Hall India,\n" +
                "2. Schaum’s outline of Electric Circuits by Mahmood Nahvi & Joseph Edminister\n" +
                "3. Network Lines and Fields by John D. Ryder, PHI.\n" +
                "4. Network Theory by D. Chattopadhyay and P.C.Rakshit, S.Chand & Co. Ltd.\n");
        adapter = new ArrayAdapter(Circuit_Theory.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
