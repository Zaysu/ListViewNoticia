package com.jc.noticia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class NoticiaDetalhadaActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_detalhada);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        String corpo = intent.getStringExtra("corpo");
        int imagemId = intent.getIntExtra("imagem", 0);

        TextView tituloTextView = findViewById(R.id.detalheTitulo);
        TextView corpoTextView = findViewById(R.id.detalheCorpo);
        ImageView imagemView = findViewById(R.id.detalheImagem);

        tituloTextView.setText(titulo);
        corpoTextView.setText(corpo);
        imagemView.setImageResource(imagemId);
    }
}
