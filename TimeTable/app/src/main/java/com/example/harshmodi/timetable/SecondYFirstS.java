package com.example.harshmodi.timetable;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class SecondYFirstS extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_yfirst_s);
        setupUI();
        initToolbar();
        setupListView();
    }

    private void setupUI(){
        toolbar = (Toolbar)findViewById(R.id.Toolbar2Y1S);
        listView = (ListView)findViewById(R.id.lv2Y1S);

    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Second Year First Semester");
    }

    private void setupListView() {
        String[] title = getResources().getStringArray(R.array.SecondY_1S_Sub);
        String[] description = getResources().getStringArray(R.array.SecondY_1S_Desc);

        SecondYFirstS.SimpleAdapter simpleAdapter = new SecondYFirstS.SimpleAdapter(this, title, description);
        listView.setAdapter(simpleAdapter);

    }

    public class SimpleAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater layoutInflater;
        private TextView title, description;
        private String[] titleArray;
        private String[] descArray;
        private ImageView imageView;
        private Button check;

        public SimpleAdapter(Context context, String[] title, String[] description){
            mContext = context;
            titleArray = title;
            descArray = description;
            layoutInflater = LayoutInflater.from(context);
        }



        @Override
        public int getCount() {
            return titleArray.length;
        }

        @Override
        public Object getItem(int i) {
            return titleArray[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null){
                view = layoutInflater.inflate(R.layout.main_single_item, null);
            }
            view.setBackgroundColor(getResources().getColor(R.color.yellow));
            title = (TextView)view.findViewById(R.id.tvMain);
            description = (TextView)view.findViewById(R.id.tvDesc);
            imageView = (ImageView)view.findViewById(R.id.ivMain);
            check = (Button)view.findViewById(R.id.CheckButton);

            title.setText(titleArray[i]);
            description.setText(descArray[i]);

            if(titleArray[i].equalsIgnoreCase("Mathematics – IV")){
                imageView.setImageResource(R.drawable.m);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), Maths_IV.class);
                        startActivity(myIntent1);
                    }
                });
            }
            else if(titleArray[i].equalsIgnoreCase("Digital Circuits")){
                imageView.setImageResource(R.drawable.d);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), Digital_Circuit.class);
                        startActivity(myIntent1);
                    }
                });
            }
            else if(titleArray[i].equalsIgnoreCase("Data Structures and Algos")){
                imageView.setImageResource(R.drawable.d);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), DSA.class);
                        startActivity(myIntent1);
                    }
                });
            }
            else if(titleArray[i].equalsIgnoreCase("Numerical Methods")){
                imageView.setImageResource(R.drawable.n);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), NM.class);
                        startActivity(myIntent1);
                    }
                });
            }
            else if(titleArray[i].equalsIgnoreCase("Computer Organization")){
                imageView.setImageResource(R.drawable.c);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), CO.class);
                        startActivity(myIntent1);
                    }
                });
            }
            else {
                imageView.setImageResource(R.drawable.e); // ETech
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent1 = new Intent(view.getContext(), ETech.class);
                        startActivity(myIntent1);
                    }
                });
            }

            return view;

        }
    }
}