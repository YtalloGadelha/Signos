package com.example.android.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listaSignos;
    private String[] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" };

    private String[] perfis = {
            "Corajoso, determinado, confiante, entusiasmado, otimista, honesto, passional",
            "Confiável, paciente, prático, dedicado, responsável, estável",
            "Versátil, curioso, divertido e quer experimentar tudo o que existe no mundo, então a sua companhia nunca é chata ou entediante",
            "Tenaz, altamente criativo, leal, emocional, simpático, persuasivo",
            "Criativo, apaixonado, generoso, caloroso, alegre, bem-humorado",
            "Fiel, analítico, gentil, trabalhador, prático",
            "Cooperativo, diplomático, gracioso, justo, social",
            "Versátil, corajoso, apaixonado, teimoso, amigo verdadeiro",
            "Generoso, idealista, grande senso de humor",
            "Responsável, disciplinado, autocontrole, bom gerente",
            "Progressivo, original, independente, humanitário",
            "Compassivo, artístico, intuitivo, gentil, sábio, musical" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int codigoPosicao = position;
        String signoClicado = perfis[codigoPosicao];
        Toast.makeText(MainActivity.this, signoClicado, Toast.LENGTH_SHORT).show();
    }
}
