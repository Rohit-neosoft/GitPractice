package com.example.neosoft.tabviewpager.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.neosoft.tabviewpager.R;
import com.example.neosoft.tabviewpager.fragments.ScreenAFragment;
import com.example.neosoft.tabviewpager.interfaces.ItemClickCallback;
import com.example.neosoft.tabviewpager.models.Item;

import java.util.List;

/**
 * Created by Neosoft on 8/10/2017.
 */

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.MyViewHolder> {

    private List<Item> itemList;
    private ItemClickCallback itemClickCallback;

    public ListViewAdapter(ItemClickCallback itemClickCallback, List<Item> itemList) {
        this.itemList=itemList;
        this.itemClickCallback=itemClickCallback;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSubTitle;

        MyViewHolder(View view) {
            super(view);
            tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            tvSubTitle = (TextView) view.findViewById(R.id.tvSubTitle);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickCallback.getListPosition(getLayoutPosition());

                }
            });
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvTitle.setText(itemList.get(position).getTitle()+" "+ position );
        holder.tvSubTitle.setText(itemList.get(position).getSubTitle()+" "+ position );

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickCallback.getListPosition(position);
            }
        });*/

        //holder.tvTitle.setText("Title "+" "+ position );
        //holder.tvSubTitle.setText("Subtitle"+" "+ position );
    }

    @Override
    public int getItemCount() {
        return itemList.size();
        //return  30;
    }
}
