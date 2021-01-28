package com.q.qandroid.ui.home;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class TabViewModel extends ViewModel {

    private ArrayList<String> tabNameArray;

    public TabViewModel() {
        tabNameArray = new ArrayList<String>();
        tabNameArray.add("1");
        tabNameArray.add("2");
        tabNameArray.add("3");
    }

    public String getData(int index) {
        return this.tabNameArray.get(index);
    }

    public int getSize() {
        return tabNameArray.size();
    }
}