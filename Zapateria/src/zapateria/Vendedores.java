/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapateria;

/**
 *
 * @author Amparo
 */
public class Vendedores extends ZapateriaNegocio{
	
	private double cantidadVentas;
	
	public Vendedores(String nombre, double sueldoBase, int iD, double cantidadVentas) {
		super(nombre, sueldoBase, iD);
		this.cantidadVentas = cantidadVentas;
	}
		
	public double getCantidadVentas() {
		return cantidadVentas;
	}
	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	
	public double calcularPrecioComision() {
		double comision= this.cantidadVentas*(this.sueldoBase*0.10);
		return comision;
	}
}