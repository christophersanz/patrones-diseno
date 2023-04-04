package com.mitocode.forma;

import com.mitocode.color.IColor;

public abstract class IFigura {
	protected IColor color;
	public abstract void dibujar();

	public IFigura(IColor color){
		this.color=color;
	}
}
