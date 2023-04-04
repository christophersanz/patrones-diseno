package com.mitocode.forma.impl;

import com.mitocode.color.IColor;
import com.mitocode.forma.IFigura;

public class Circulo extends IFigura {

    public Circulo(IColor color){
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo...");
        color.pintar();
    }

}
