 package com.example.examjurabekov__sherzod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import com.example.examjurabekov__sherzod.adapter.CustomAdapter;
import com.example.examjurabekov__sherzod.model.User;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;
     Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        List<User> members = prepareMemberList();
        refreshAdapter(members);
    }
     private void initView(){
         context = this;
         recyclerView = findViewById(R.id.recycle_view_main);
         recyclerView.setLayoutManager(new GridLayoutManager(context,3));
         int orientation = getResources().getConfiguration().orientation;
         if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
             recyclerView.setLayoutManager(new GridLayoutManager(context,3));
         } else {
             recyclerView.setLayoutManager(new GridLayoutManager(context,1));
         }
     }
     private void refreshAdapter(List<User> users) {
         CustomAdapter adapter = new CustomAdapter(users, this);
         recyclerView.setAdapter(adapter);


     }

     private List<User> prepareMemberList(){
         List<User> members = new ArrayList<>();
         for (int i = 0; i < 30; i++) {
             if (i % 5 == 0) {
                 members.add(new User(R.drawable.img_1, "pasta dinner ", "Buxora", "pasta"));
             }
             if (i % 5 == 1) {
                 members.add(new User(R.drawable.img_2, "pasta dinner ", "Buxora", "pasta"));
             }
             if (i % 5 == 2) {
                 members.add(new User(R.drawable.img_3, "pasta dinner ", "Buxora", "pasta"));
             }
             if (i % 5 == 3) {
                 members.add(new User(R.drawable.img_6, "pasta dinner ", "Buxora", "pasta"));
             }
             if (i % 5 == 4) {
                 members.add(new User(R.drawable.img_7, "pasta dinner ", "Buxora", "pasta"));
             }
         }
         return members;
     }
}