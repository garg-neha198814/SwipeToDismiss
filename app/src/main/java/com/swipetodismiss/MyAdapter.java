package com.swipetodismiss;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by root on 31/3/16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Activity context;
    private ArrayList<String> messagesList = new ArrayList<>();


    public MyAdapter(Activity context, ArrayList<String> messagesList) {

        this.context = context;
        this.messagesList = messagesList;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtMessage;


        ViewHolder(View view) {
            super(view);

            txtMessage = (TextView) view.findViewById(R.id.message);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_message_layout, parent, false);
        ViewHolder dataView = new ViewHolder(v);

        return dataView;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.txtMessage.setText(messagesList.get(position));
        holder.txtMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked");
            }
        });


    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }

}
