package com.mohitmehta317.ekladka;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class part10 extends Fragment {
    private TextView textView;
    private View view,view1;
    ArrayList customListDataModelArrayList = new ArrayList<>();
    ListView list_view;
    public static final ArrayList<String> desc = new ArrayList<String>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.part10,container,false);


        return view;

    }

}
