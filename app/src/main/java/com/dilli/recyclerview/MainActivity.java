package com.dilli.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private String name;
    private Integer phoneNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
//create a list of contacts to display in recyclerview

        List<Contacts> contactsList = new ArrayList<>();

        contactsList.add(new Contacts("Dahayang Rai", "5636666663", R.drawable.a));
        contactsList.add(new Contacts("Nikhil Uperti", "5636666663", R.drawable.b));
        contactsList.add(new Contacts("Rajesh Hamal", "5636666663", R.drawable.c));
        contactsList.add(new Contacts("Dahayang Rai", "5636666663", R.drawable.a));
        contactsList.add(new Contacts("Nikhil Uperti", "5636666663", R.drawable.b));
        contactsList.add(new Contacts("Rajesh Hamal", "5636666663", R.drawable.c));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
