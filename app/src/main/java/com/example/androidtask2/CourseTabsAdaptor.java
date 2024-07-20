package com.example.androidtask2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtask2.Data.CourseDetailsData;
import com.example.androidtask2.Data.TabContent;

import java.util.ArrayList;



public class CourseTabsAdaptor extends RecyclerView.Adapter<CourseTabsAdaptor.ViewHolder>{

    @NonNull
    @Override
    public CourseTabsAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.course_tab, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseTabsAdaptor.ViewHolder holder, int position) {

        TabContent courseData = TabContent.getCoursesTabData().get(position);

        Context context = holder.itemView.getContext();

        holder.courseImage.setImageResource(courseData.image);
        holder.courseText.setText(courseData.courseText);

        holder.courseText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View itemView) {
                if(itemView instanceof Button){
                    Toast.makeText(itemView.getContext(),  "Hello " , Toast.LENGTH_LONG).show();

                    Intent intent = new Intent( context, CourseDetailsActivity.class);
                    int index = courseData.id -1 ;
                    intent.putExtra("content", index);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return  TabContent.getCoursesTabData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView courseImage;
        public Button courseText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            courseImage =  itemView.findViewById(R.id.course_image);
            courseText =  itemView.findViewById(R.id.course_text);
        }
    }
}
