package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Digital_Circuit extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital__circuit);

        lv = (ListView)findViewById(R.id.lvDC);
        list.add("Different logic families- Diode Logic, DCTL, RTL, IIL, DTL, HTL, TTL, ECL, MOS &\n" +
                "CMOS – their operations, Characteristics and specifications. Open collector & Tristate\n" +
                "gates, wired-AND and bus operations.\n");
        list.add("Timing circuits- 555 timer & its use as monostable and astable multivibrators, VCO and\n" +
                "PLL-their operational principles and applications.\n");
        list.add("Memory devices: semiconductor main memory RAM, ROM, EPROM, EAPROM etc.\n" +
                "Secondary storage device principles.\n");
        list.add("Analog digital interfacing: Different D/A and A/D conversion techniques, sample-hold\n" +
                "units and analog multiplexers in multichannel data acquisition.\n");
        list.add("Suggested Readings:\n" +
                "1. Millman & Halkias- Integrated Electronics\n" +
                "2. Taub & Schilling- Digital Integrated Electronics\n");
        adapter = new ArrayAdapter(Digital_Circuit.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
