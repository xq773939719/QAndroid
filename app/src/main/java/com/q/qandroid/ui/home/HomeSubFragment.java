package com.q.qandroid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.q.qandroid.R;
import com.google.android.material.tabs.TabLayout;

public class HomeSubFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.inner_fragment, container, false);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getContext(), getChildFragmentManager());

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = root.findViewById(R.id.tabs);
        tabs.setBackgroundColor(getResources().getColor(R.color.White));
        tabs.setTabTextColors(getResources().getColor(R.color.Tint), getResources().getColor(R.color.Primary));
        tabs.setupWithViewPager(viewPager);
        return root;
    }
}