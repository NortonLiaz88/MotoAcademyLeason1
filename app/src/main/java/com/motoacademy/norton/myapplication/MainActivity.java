package com.motoacademy.norton.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.motoacademy.norton.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupNavigationButton();
    }

    private void setupNavigationButton() {
        binding.cbNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click no botão", Toast.LENGTH_LONG).show();
//            Log.i("DEBUG", "NAVIGATE");
//            Intent intent = new Intent(this, DetailActivity.class);
//            this.startActivity(intent);
            }
        });
    }
}