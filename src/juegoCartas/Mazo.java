package juegoCartas;

import java.util.Random;

public class Mazo {
	Carta[] cartas;
	int cantCartas;
	public Mazo() {
		this.cantCartas=40;
		this.cartas=new Carta[40];
		int j=0;
		for(int p=0; p<=3;p++) {
			for(int i=1;i<=7;i++) {
				cartas[j]=new Carta(p,i);
				j++;
			}
			for(int i=10;i<=12;i++) {
				cartas[j]=new Carta(p,i);
				j++;
			}
		}
	}
	
	public void mostrar() {
		for(int i=0; i<cantCartas;i++) {
			System.out.println(cantCartas);
		}
	}
	
	
	public void mezclar() {
		Random r =new Random();
		for(int k =0; k<10;k++) {
			int pos1=r.nextInt(40);
			int pos2=r.nextInt(40);
			Carta aux=cartas[pos1];
			cartas[pos1]=cartas[pos2];
			cartas[pos2]=aux;
		}
	}
	
	public Carta darCarta() {
		Carta aux = cartas[cantCartas-1];
		cartas[cantCartas-1]=null;
		cantCartas--;
		return aux;
	}
	
	public int cantCartas() {
		return cantCartas;
	}

}
