package com.example.viewmodel_test;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.viewmodel_test.databinding.ActivityDbActivityBinding;

public class DBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_activity);

        ContadorDB contador = new ViewModelProvider(this).get(ContadorDB.class);
        contador.setDefaultData(); //inicializamos las variables de contador

        ActivityDbActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_db_activity);
        binding.setContador(contador);

        Button botonAumentar = findViewById(R.id.botonAumentar);
        botonAumentar.setOnClickListener(view -> {
            contador.aumentar();

            Log.e("msg", contador.i.get() + "");
        });
    }
}