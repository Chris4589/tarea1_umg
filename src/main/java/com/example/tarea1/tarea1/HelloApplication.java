package com.example.tarea1.tarea1;


import com.example.tarea1.tarea1.dto.Client;
import com.example.tarea1.tarea1.dto.Color;

import java.util.ArrayList;

public class HelloApplication {
    public static void main(String[] args) {
        Client client = new Client();
        client.setEmail("test@asd.com");
        client.setID("123");
        client.setName("Test");
        client.setNit("123456");

        var colors = new ArrayList<Color>();

        var rojo = new Color();
        rojo.setHex("#FF0000");
        rojo.setName("Rojo");
        colors.add(rojo);

        var azul = new Color();
        azul.setHex("#0000FF");
        azul.setName("Azul");
        colors.add(azul);

        var verde = new Color();
        verde.setHex("#00FF00");
        verde.setName("Verde");
        colors.add(verde);

        client.setColors(colors);

        client.dispatch();
    }
}