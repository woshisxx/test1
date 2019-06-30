package com.example.test1;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    private String name;
    private String sex;

    public User(String name,String sex){
        this.name=name;
        this.sex=sex;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.example.test1.BR.name);
    }

    @Bindable
    public String getName(){
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(com.example.test1.BR.sex);
    }

    @Bindable
    public String getSex(){
        return sex;
    }

    public void click(View view) {
        Toast.makeText(view.getContext(), getName(), Toast.LENGTH_SHORT).show();
    }
}
