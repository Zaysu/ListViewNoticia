package com.jc.noticia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    List<Contact> contactList;

    public ContactAdapter(@NonNull Context context, List<Contact> contactList) {
        super(context, 0, contactList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
        }
        Contact currentContact = getItem(position);
        TextView tituloTextView = convertView.findViewById(R.id.contactTitulo);
        TextView corpoTextView = convertView.findViewById(R.id.contactCorpo);
        ImageView imageView = convertView.findViewById(R.id.contactImage);
        tituloTextView.setText(currentContact.getTitulo());
        imageView.setImageResource(currentContact.getImageResourceId());
        corpoTextView.setText(currentContact.getCorpo());
        return convertView;
    }
}
