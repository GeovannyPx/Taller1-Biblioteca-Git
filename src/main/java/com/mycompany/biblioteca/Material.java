package com.mycompany.biblioteca;

public class Material {

    private int materialId;
    private String title;

    public Material(int materialId, String title) {
        this.materialId = materialId;
        this.title = title;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}