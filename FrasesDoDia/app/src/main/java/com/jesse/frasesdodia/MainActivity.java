package com.jesse.frasesdodia;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Você é o meu lugar favorito no mundo.",
            "Seu sorriso ilumina até os meus dias mais nublados.",
            "Com você, tudo fica mais leve e bonito.",
            "Te amar é a melhor parte do meu dia.",
            "Seu abraço é o meu porto seguro.",
            "Cada momento ao seu lado é especial.",
            "Você faz meu coração sorrir.",
            "Amar você é fácil demais.",
            "Meu mundo é melhor com você nele.",
            "Você é o motivo do meu sorriso bobo.",
            "Meu melhor momento do dia é quando estou com você.",
            "Seu olhar me acalma e me faz feliz.",
            "Você é a razão do meu sorriso mais sincero.",
            "Te ter por perto é tudo o que preciso.",
            "Meu coração é seu, hoje e sempre.",
            "Você é o sonho que eu nunca quero acordar.",
            "Seu carinho é o que me faz bem.",
            "Com você, cada dia é uma nova aventura.",
            "Você é a minha paz em meio ao caos.",
            "Te amar é o meu maior presente.",
            "Seu beijo tem gosto de felicidade.",
            "Você é a melhor parte de mim.",
            "Meu amor por você só cresce a cada dia.",
            "Você é o meu pensamento favorito.",
            "Nada é mais bonito do que o nosso amor.",
            "Você faz tudo valer a pena.",
            "Meu sorriso tem seu nome.",
            "Você é o meu porto seguro.",
            "Te encontrar foi o melhor que me aconteceu.",
            "Você é a minha pessoa preferida.",
            "Com você, tudo faz sentido.",
            "Seu amor me faz querer ser melhor.",
            "Você é o meu raio de sol.",
            "Te amar é simples e natural.",
            "Você é o meu melhor destino.",
            "Meu coração bate mais forte por você.",
            "Você é o meu conto de fadas real.",
            "Seu abraço é o meu lar.",
            "Você é a minha inspiração diária.",
            "Te amo mais do que ontem e menos do que amanhã.",
            "Você é o meu melhor amigo e amor.",
            "Com você, a vida é mais colorida.",
            "Você é o meu maior tesouro.",
            "Seu sorriso é o meu combustível.",
            "Você faz meus dias mais felizes.",
            "Te amar é a minha missão.",
            "Você é a minha sorte grande.",
            "Meu mundo gira ao seu redor.",
            "Você é o meu para sempre favorito.",
            "Te amo com todas as letras, palavras e sentimentos."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void gerarFrases(View view) {
        TextView texto = findViewById(R.id.fraseDoDia);

        int numero = (int) (Math.random() * frases.length);
        texto.setText(frases[numero]);

    }

//    public void exibirTodas(View view) {
//        TextView texto = findViewById(R.id.fraseDoDia);
//        Log.d("Teste Exibir", "Clicou no botão");
//
//        String todasFrases = "";
//        for (String frase : frases) {
//            todasFrases += frase + "\n";
//        }
//        texto.setText(todasFrases);
//
//    }

}