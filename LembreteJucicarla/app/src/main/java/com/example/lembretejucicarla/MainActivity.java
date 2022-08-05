package com.example.lembretejucicarla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoEntrar;
    private TextView caixaNome;

    public Button getBotaoEntrar() {
        return botaoEntrar;
    }

    public void setBotaoEntrar(Button botaoEntrar) {
        this.botaoEntrar = botaoEntrar;
    }

    public TextView getCaixaNome() {
        return caixaNome;
    }

    public void setCaixaNome(TextView caixaNome) {
        this.caixaNome = caixaNome;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botaoEntrar = findViewById(R.id.botaoEntrar);
        TextView caixaNome = findViewById(R.id.caixaNome);
    }
}