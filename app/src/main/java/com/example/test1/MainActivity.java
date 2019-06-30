package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    List<User> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        data.add(new User("sxx1","女"));
        data.add(new User("sxx2","男"));
        list.setAdapter(new MyAdapter(this,getLayoutInflater(),R.layout.item_list,BR.user,data));
    }
}
