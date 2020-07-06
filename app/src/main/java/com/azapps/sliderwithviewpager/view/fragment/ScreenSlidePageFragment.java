package com.azapps.sliderwithviewpager.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.azapps.sliderwithviewpager.R;

public class ScreenSlidePageFragment extends Fragment {
    private TextView textView;

    public ScreenSlidePageFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_slide_page_fragment,container,false);
        textView = view.findViewById(R.id.tv);
        textView.setText(getArguments().getString("msg"));
        return view;
    }
}
