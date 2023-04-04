package com.mitocode.forma.impl;

import com.mitocode.color.IColor;
import com.mitocode.forma.IFigura;

public class Rectangulo extends IFigura {

    public Rectangulo(IColor color){
        super(color);
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando rectangulo...");
        color.pintar();
    }
    
}
