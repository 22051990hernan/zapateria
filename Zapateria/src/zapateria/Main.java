/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapateria;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
	ArrayList<Vendedores> vendedores = new ArrayList<>();
	ArrayList<Soporte> soportes = new ArrayList<>();
	
	Vendedores v1 = new Vendedores("Hernan", 2300000, 1, 5);
	Vendedores v2 = new Vendedores("lucas", 150000, 2, 20);
	Vendedores v3 = new Vendedores("walter", 500000, 3, 2);
	vendedores.add(v1);
	vendedores.add(v2);
	vendedores.add(v3);
	
	Soporte s1 = new Soporte("nestor", 730000, 1, 5);
	Soporte s2 = new Soporte("luz", 630000, 2, 9);
	Soporte s3 = new Soporte("rosa", 525000, 3, 2);
	soportes.add(s1);
	soportes.add(s2);
	soportes.add(s3);
	
	for (Vendedores vendedor : vendedores) {
		System.out.println("Vendedores : "+"numero :" + vendedor.getID() + " " + vendedor.calcularPrecioComision());
	}
	
	for (Soporte soporte : soportes) {
		System.out.println("Soportes : "+"numero :" + soporte.getID() + " " + soporte.calcularHorasExtra());
	}
	

	
	}
	
	
}