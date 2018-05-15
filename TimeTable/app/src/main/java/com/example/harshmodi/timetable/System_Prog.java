package com.example.harshmodi.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class System_Prog extends AppCompatActivity {

    private ListView lv;
    List<String> list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system__prog);

        lv = (ListView)findViewById(R.id.lvSysProg);
        list.add("Introduction to Systems Programming \n" +
                "Assembler - Functions of an assembler, features (with respect to machine dependence) of an\n" +
                "assembler, design of assembler – two pass, one pass, concept of overlay\n");

        list.add("Assembler Design:\n A case study – Overview of 16 / 32 bit architecture and assembly language\n" +
                "programming features, Functionalities and design of assembler for such specifications\n");

        list.add("Macro processor:\n Functions of macro processor, features of macro processor, design of macro\n" +
                "processor\n");
        list.add("Loaders and Linkers:\n functions of loader, absolute loader, bootstrap loader, Machine dependent\n" +
                "and machine independent features of loader, Relocation, Linking, concept and design of\n" +
                "relative/relocating loader, linking loader, linkage editor, dynamic linking and dynamic loading\n");
        list.add("Text editor:\n types of editors, types of files, features, examples\n");
        list.add("Cross assembler:\n requirements, features, example\n");
        list.add("Debug:\n functions of a debugger, hardware support for debugging, example debuggers\n");
        list.add("Device drivers:\n concepts, design and developing\n");
        list.add("Window manager:\n Features and facilities, types, examples of X Windows manager, widget\n" +
                "toolkit\n");
        list.add("Suggested Readings:\n" +
                "1. System Software: An Introduction to Systems Programming – L. Beck\n" +
                "2. System Software – M. Joseph, Laxmi Publications\n" +
                "3. Systems Programming and Operating Systems – D. M. Dhamdhere, TMH\n" +
                "4. Linux Device Drivers – J. Corbet, A. Rubini, G. Kroah-Hartman, O’ Reilly Media\n");

        adapter = new ArrayAdapter(System_Prog.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
