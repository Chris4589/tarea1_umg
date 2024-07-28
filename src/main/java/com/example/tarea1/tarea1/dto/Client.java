package com.example.tarea1.tarea1.dto;

import java.util.List;

public class Client extends Person {
    private String nit;
    private List<Color> colors;

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public void dispatch() {
        System.out.println("Cliente " + getName() + " con NIT " + getNit() + " y correo " + getEmail() + " está despachando colores");

        colors.forEach(color -> {
            System.out.println("Despachando color " + color.getName() + " con código " + color.getHex());
        });
    }
}
