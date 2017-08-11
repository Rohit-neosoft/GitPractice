package com.example.neosoft.tabviewpager.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.neosoft.tabviewpager.R;
import com.example.neosoft.tabviewpager.adapters.ListViewAdapter;
import com.example.neosoft.tabviewpager.interfaces.ItemClickCallback;
import com.example.neosoft.tabviewpager.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenAFragment extends Fragment implements ItemClickCallback {

    List<Item> itemList=new ArrayList<>();
    private RecyclerView recyclerView;

    public ScreenAFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_a, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView= (RecyclerView) view.findViewById(R.id.listView);

        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));
        itemList.add(new Item("Title","Subtitle"));

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new ListViewAdapter(this,itemList));
    }

    @Override
    public void getListPosition(int itemPosition) {
        Toast.makeText(getActivity(), itemList.get(itemPosition).getTitle()+" "+itemPosition, Toast.LENGTH_SHORT).show();
    }
}
