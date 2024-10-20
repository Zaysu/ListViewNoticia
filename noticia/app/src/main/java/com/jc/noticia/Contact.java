package com.jc.noticia;

public class Contact {
    public Contact(String titulo, String corpo, int imageResourceId) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    private String titulo;
    private int imageResourceId;
    private String corpo;
}
