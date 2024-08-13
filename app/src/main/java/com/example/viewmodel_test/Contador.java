package com.example.viewmodel_test;

import androidx.lifecycle.ViewModel;

public class Contador extends ViewModel {

    public int i = 0;
    public String texto = "";

    public void setDefaultData(){

        this.i = 0;
        this.texto = "";

    }
}
