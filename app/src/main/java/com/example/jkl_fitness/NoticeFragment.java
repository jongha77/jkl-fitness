package com.example.jkl_fitness;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class NoticeFragment extends Fragment {

    private View view;
    private String TAG = "NoticeFragment";

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreatView");

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notice, container, false);
        return view;
    }
}