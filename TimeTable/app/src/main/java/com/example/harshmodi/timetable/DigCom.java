package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class DigCom extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dig_com);

        lv = (ListView)findViewById(R.id.lvDigCom);
        list.add("Introduction:\n Data and signal fundamentals, Analog and digital signals\n");
        list.add("Signals and Signal Analysis:\n Periodic and nonperiodic signals, Composite signals,\n" +
                "Signal analysis, Time and frequency domain representation, Bandwidth, Wave symmetry,\n" +
                "Linear and non-linear mixing of signals.\n");
        list.add("Transmission Impairments:\n Attenuation, Distortion, Noise - correlated and\n" +
                "uncorrelated noises and their categories, Thermal noise, Noise factor and noise figure,\n" +
                "Harmonic distortion and intermodulation distortion, Data rate limits for noisy and\n" +
                "noiseless channels, Performance\n");
        list.add("Digital Transmission:\n Problems with digital transmission, Different line\n" +
                "coding schemes, Block coding schemes, Scrambling techniques; Analog to digital\n" +
                "conversion – Sampling techniques, Sampling theorem, Pulse amplitude modulation, Pulse\n" +
                "code modulation, Differential pulse code modulation, Delta modulation (along with\n" +
                "advantages and disadvantages of each technique), Transmission modes (serial and\n" +
                "parallel).\n");
        list.add("Analog Transmission:\n Concepts of carrier signal, modulating signal and modulated\n" +
                "signal; Amplitude modulation – double sideband suppressed carrier, double sideband\n" +
                "transmitted carrier, single sideband; Frequency modulation – Narrowband FM and\n" +
                "wideband FM; Digital to analog conversion – Amplitude shift keying, Frequency shift\n" +
                "keying, Phase shift keying, Quadrature amplitude modulation, Performance\n");
        list.add("Transmission Media:\n Guided (wired) media – Twisted pair cable, Coaxial cable and\n" +
                "Fibre optic cable, Construction, categories and connectors of each type, Performance,\n" +
                "Advantages and disadvantages and applications of each type of media, Different\n" +
                "propagation modes through fibre optic cable, Unguided (wireless) media – Different\n" +
                "propagation modes, Radio waves, Terrestrial microwaves, Infrared, Applications and\n" +
                "performances, Satellite communication.\n");
        list.add("Multiplexing and Spreading:\n Concept of multiplexing, Frequency division\n" +
                "multiplexing, Time division multiplexing – Synchronous and Statistical time division\n" +
                "multiplexing, Handling variable length data, Pulse stuffing, Concept of spreading\n" +
                "spectrum, Frequency hopping spread spectrum and Direct sequence spread spectrum.");
        list.add("Modems and Interfaces:\n Dial-up modems, modem speed, standards; other modems;\n" +
                "Interface standards.\n");
        list.add("Error Detection and Correction:\n Types of errors, Basic concepts of error detection and\n" +
                "correction, Redundancy, Hamming distance, Error detection – Simple parity check codes,\n" +
                "Two-dimensional parity check, Cyclic redundancy check, Polynomials and cyclic code\n" +
                "analysis, Checksum, Error correction – Hamming code.\n");
        list.add("Protocols for Data Communication:\n Flow control and Error control, Stop and Wait\n" +
                "protocol and its efficiency, Sliding window protocols - Go-back-N and Selective repeat,\n" +
                "Piggybacking, HDLC, Point-to-point protocol.\n");
        list.add("Suggested Readings:\n" +
                "1. Data & Computer Communications, William Stallings, Pearson Education\n" +
                "2. Data Communications and Networking, Behrouz A Forouzan, McGraw Hill\n" +
                "3. Electronic Communications Systems, Tomasi, Pearson Education\n" +
                "4. Digital Communications, Haykin, Wiley\n");

        adapter = new ArrayAdapter(DigCom.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
}
