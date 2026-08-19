package com.mycompany.biblioteca;

public class Libro extends Material {

    private String author;
    private boolean available;

    public Libro(int materialId, String title, String author, boolean available) {
        super(materialId, title);
        this.author = author;
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}