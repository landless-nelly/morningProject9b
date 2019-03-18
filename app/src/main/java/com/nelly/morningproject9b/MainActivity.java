package com.nelly.morningproject9b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView list;
ArrayList <Item> user;
CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =new ArrayList();
        adapter =new CustomAdapter(this,user);
        list=findViewById(R.id.listWatu);
        Item person=new Item("nelly","071839989490",R.drawable.kenya);
        Item person1=new Item("king","07190867577",R.drawable.kenya);
        Item person2=new Item("seffu","07235678990",R.drawable.kenya);
        Item person3=new Item("clare","07567785580",R.drawable.kenya);
        Item person4=new Item("joy","074578906590",R.drawable.kenya);
        Item person5=new Item("viv","07908768490",R.drawable.kenya);
        Item person6=new Item("andy","07235678990",R.drawable.kenya);
        user.add(person);
        user.add(person1);
        user.add(person2);
        user.add(person3);
        user.add(person4);
        user.add(person5);
        user.add(person6);
        list.setAdapter(adapter);

    }
}
