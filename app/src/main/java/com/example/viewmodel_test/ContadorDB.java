package com.example.viewmodel_test;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class ContadorDB extends ViewModel {

    public ObservableField<Integer> i;
    public ObservableField<String> texto;

    public void setDefaultData(){

        if(this.i == null) {
            this.i = new ObservableField<>();
            this.texto = new ObservableField<>();

            this.i.set(0);
            this.texto.set("");
        }
    }

    public void aumentar(){
        this.i.set(this.i.get() + 1);
    }
}
