package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
public class Physics extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        lv = (ListView)findViewById(R.id.lvPhy);
        list.add("Assumption for the kinetic theory of gases, Expression for pressure, Significance of\n" +
                "temperature, Deduction of gas laws, Qualitative idea of (i) Maxwell's velocity distribution. (ii)\n" +
                "degrees of freedom and equipartition of energy, Specific heat of gases at constant volume and\n" +
                "constant pressure.\n");
        list.add("Equation of state of a gas, Andrew's experiment, Qualitative discussion on van der Waal's\n" +
                "equation of state, Critical constants, Law of corresponding states.\n");
        list.add("Macroscopic and microscopic description, Thermal equilibrium, Zeroth law of\n" +
                "thermodynamics, Concept of international practical temperature scale, Heat and Work, First law\n" +
                "of thermodymamics and some applications, Reversible and irreversible processes, Carnot cycle,\n" +
                "Second law of thermodymamics, Concept of entropy, Thermodynamic relations.\n");
        list.add("Energy levels of the hydrogen atom and the Bohr atom model, X-ray spectra, X-ray diffraction,\n" +
                "Bragg's law, Compton effect.\n");
        list.add("Introduction to Quantum Mechanics. Schrodinger Equation, Angular Momentum, Spin, De-\n" +
                "Broglie waves, Particle diffraction, Heisenberg’s Uncertainty principle and its application.\n");

        adapter = new ArrayAdapter(Physics.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
