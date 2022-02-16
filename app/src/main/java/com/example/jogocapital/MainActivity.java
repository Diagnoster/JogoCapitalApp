package com.example.jogocapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int tries = 0;
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkChoice(View view) {
        TextView out = findViewById(R.id.textViewOutputState);
        TextView outResult = findViewById(R.id.textViewOutputResult);
        TextView outPoints = findViewById(R.id.textViewPoints);
        EditText input = findViewById(R.id.editTextInput);
        String chute = input.getText().toString();
        Button btn = (Button) findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.button2);
        String estadoAtual = out.getText().toString();

        if (input.length() == 0) {
            Toast msg = Toast.makeText(this, "Insira um valor", Toast.LENGTH_SHORT);
            msg.show();
        } else if(estadoAtual == "") {
            Toast msg = Toast.makeText(this, "Clique no botão próxima para sortear um Estado", Toast.LENGTH_SHORT);
            msg.show();
        } else if (tries <= 4){
            Map<String, String> example = new HashMap<>();

            example.put("Paraná", new String("Curitiba"));
            example.put("Mato Grosso do Sul", new String("Campo Grande"));
            example.put("Rio de Janeiro", new String("Rio de Janeiro"));
            example.put("Piauí", new String("Teresina"));
            example.put("Ceará", new String("Fortaleza"));
            example.put("Rio Grande do Norte", new String("Natal"));
            example.put("Pernambuco", new String("Recife"));
            example.put("Minas Gerais", new String("Belo Horizonte"));
            example.put("Roraima", new String("Boa Vista"));
            example.put("Rio Grande do Sul", new String("Porto Alegre"));
            example.put("Amazonas", new String("Manaus"));
            example.put("Bahia", new String("Salvador"));
            example.put("Sergipe", new String("Aracaju"));
            example.put("Acre", new String("Rio Branco"));
            example.put("Tocantins", new String("Palmas"));

            if(example.get(estadoAtual).matches(chute)) {
                outResult.setText("Parabéns, você acertou");
                points = points + 10;
                outPoints.setText("Pontos: " + points);
                input.setText("");
                btn.setEnabled(false);
                btn1.setEnabled(true);
                tries++;
            } else {
                outResult.setText("Você errou!");
                input.setText("");
                btn.setEnabled(false);
                btn1.setEnabled(true);
                tries++;
            }
        }

    }

    public void nextQuestion(View view) {
        TextView out = findViewById(R.id.textViewOutputState);
        Button btn = (Button) findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.button2);
        TextView outResult = findViewById(R.id.textViewOutputResult);
        TextView outPoints = findViewById(R.id.textViewPoints);
        EditText input = findViewById(R.id.editTextInput);

        if (tries == 5) {
            Toast msg = Toast.makeText(this, "Fim de jogo, você usou todas as 5 tentativas! Pontuação final: " + points , Toast.LENGTH_LONG);
            msg.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            msg.show();
            btn.setEnabled(false);
            btn1.setEnabled(true);
            input.setText("");
            outResult.setText("");
            outPoints.setText("Pontos: " + 0);
            tries = 0;
            points = 0;
        }

        String[] estados = {
                "Paraná",
                "Mato Grosso do Sul",
                "Rio de Janeiro",
                "Piauí",
                "Ceará",
                "Rio Grande do Norte",
                "Pernambuco",
                "Minas Gerais",
                "Roraima",
                "Rio Grande do Sul",
                "Amazonas",
                "Bahia",
                "Sergipe",
                "Acre",
                "Tocantins"
            };

        Random r = new Random();
        int num = r.nextInt(14);
        out.setText(estados[num]);
        btn.setEnabled(true);
        btn1.setEnabled(false);


    }


}