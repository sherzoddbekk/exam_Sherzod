package com.example.examjurabekov__sherzod.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examjurabekov__sherzod.MainActivity;
import com.example.examjurabekov__sherzod.R;
import com.example.examjurabekov__sherzod.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<User> users;
    private MainActivity activity;

    public CustomAdapter(List<User> users, MainActivity activity) {
        this.users = users;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_custom,parent,false);
        return new CustomHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

       User user = users.get(position);
        if (holder instanceof CustomHolderView){

            ImageView foodp = ((CustomHolderView) holder).foodpicture;
            TextView foodt =((CustomHolderView) holder).foodtext;
            TextView place =((CustomHolderView) holder).place;
            TextView food =((CustomHolderView) holder).food;

            foodp.setImageResource(user.getFoodpicture());
            foodt.setText(user.getFoodtext());
            place.setText(user.getPlece());
            food.setText(user.getFood());


        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    private class CustomHolderView extends RecyclerView.ViewHolder{

        View view;
        ImageView foodpicture;
        TextView  foodtext, place, food;
        public CustomHolderView(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            foodpicture = itemView.findViewById(R.id.pasta_img);
            foodtext = itemView.findViewById(R.id.dinner_pasta);
            place = itemView.findViewById(R.id.buxoro);
            food = itemView.findViewById(R.id.pasta);

        }
    }
}
