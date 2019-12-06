package com.dilli.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class contact_details extends AppCompatActivity {
    private RecyclerView recyclerView;
    private String name;
    private ImageView imgProfile;
    private Integer phoneNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

    }
}
