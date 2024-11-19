/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapateria;


public class Soporte extends ZapateriaNegocio{
	
	private double cantidadHorasExtra;
	
	public Soporte(String nombre, double sueldoBase, int iD, double cantidadHorasExtra) {
		super(nombre, sueldoBase, iD);
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	public double getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
	
	public void setCantidadHorasExtra(double cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	public double calcularHorasExtra() {
		double horasExtra=this.cantidadHorasExtra*(this.sueldoBase*0.05);
		return horasExtra;
	}
}