package com.jc.noticia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Criação da lista de notícias
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Rumo a Marte: quais os planos da SpaceX depois do teste de sucesso com a maior nave do mundo", "No último domingo (13), a Starship realizou o seu quinto teste, que foi considerado um sucesso. A empresa de Elon Musk tem grandes ambições para a nave; confira.", R.drawable.ic_launcher_background));
        contactList.add(new Contact("Como retorno de foguete da SpaceX para base pode tornar voos espaciais mais baratos", "Pela primeira vez, a empresa do bilionário Elon Musk conseguiu fazer o propulsor Super Heavy voltar para a plataforma de lançamento. Manobra ajuda a reduzir custos de transporte e manutenção, explicam professores ouvidos pelo g1.", R.drawable.ic_launcher_background));
        contactList.add(new Contact("Por que empresas de tecnologia estão recorrendo à energia nuclear em projetos de IA", "Google se juntou nesta segunda-feira (14/10) a uma lista de gigantes da tecnologia que está se voltando à energia nuclear para abastecer a 'faminta' Inteligência Artificial (IA).", R.drawable.ic_launcher_background));
        contactList.add(new Contact("BNDES vai financiar R$ 500 milhões para Embraer instalar fábrica do 'carro voador' em Taubaté", "Após as fases de testes e certificação, a expectativa da Eve, empresa ligada à Embraer, é iniciar a operação com os eVTOLs, popularmente chamados de ‘carros voadores’, em 2026.", R.drawable.ic_launcher_background));


        ContactAdapter adapter = new ContactAdapter(this, contactList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Contact selectedContact = contactList.get(position);


                Intent intent = new Intent(MainActivity.this, NoticiaDetalhadaActivity.class);
                intent.putExtra("titulo", selectedContact.getTitulo());
                intent.putExtra("corpo", selectedContact.getCorpo());
                intent.putExtra("imageResourceId", selectedContact.getImageResourceId());

                startActivity(intent);
            }
        });
    }
}
