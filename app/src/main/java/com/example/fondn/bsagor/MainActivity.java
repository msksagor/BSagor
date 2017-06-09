package com.example.fondn.bsagor;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Context context;
    LayoutInflater layoutInflater ;
    ArrayList<AA> alist = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewID);

      //  String[] nameArray= {"Sagor","khan","sabuj","Dhaka","Bangladesh"};
        //int[] imageArray = {R.drawable.stumbleupon,R.drawable.tumblr,R.drawable.twitter,R.drawable.vine,R.drawable.whatspp};

       AA aobject;
        aobject = new AA("sagor");
        alist.add(aobject);


        Store s = new Store(alist,this);
        listView.setAdapter(s);




    }


}
