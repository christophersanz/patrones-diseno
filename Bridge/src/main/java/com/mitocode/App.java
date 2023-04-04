package com.mitocode;

import com.mitocode.color.impl.Negro;
import com.mitocode.color.impl.Rojo;
import com.mitocode.forma.IFigura;
import com.mitocode.forma.impl.Circulo;
import com.mitocode.forma.impl.Rectangulo;

public class App {

	public static void main(String[] args) {
		IFigura[] figuras = new IFigura[4];
		figuras[0] = new Rectangulo(new Rojo());
		figuras[1] = new Rectangulo(new Negro());
		figuras[2] = new Circulo(new Rojo());
		figuras[3] = new Circulo(new Negro());
		for (IFigura f : figuras) {
			f.dibujar();
		}
	}

}

