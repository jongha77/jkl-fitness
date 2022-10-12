package com.example.jkl_fitness;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    private View view ;
    private Button BmiButton;
    private String TAG = "HomeFragment";


    @Nullable
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreatView");
        view = inflater.inflate(R.layout.fragment_home, container, false);
        BmiButton = (Button) view.findViewById(R.id.BmiButton); //fragment에서 findViewByid는 view.을 이용해서 사용
        BmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),BmiActivity.class); //fragment라서 activity intent와는 다른 방식
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }

        });
        // Inflate the layout for this fragment
        return view;
    }
}






