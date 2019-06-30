package com.example.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private int layoutId;

    private int variabled;

    private List<User> list=new ArrayList<>();

    public MyAdapter(Context context,LayoutInflater inflater,int layoutId,
                     int variabled,List<User> list){
        this.context=context;
        this.inflater=inflater;
        this.layoutId=layoutId;
        this.variabled=variabled;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewDataBinding dataBinding;
        if(view==null){
            dataBinding= DataBindingUtil.inflate(inflater,layoutId,viewGroup,false);
        }else{
            dataBinding=DataBindingUtil.getBinding(view);
        }
        dataBinding.setVariable(variabled,list.get(i));
        return dataBinding.getRoot().getRootView();
    }
}
