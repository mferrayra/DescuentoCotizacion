package com.sc.model;

import java.io.Serializable;

public class Cotizacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String zona;
	private String modelo;
	private double cotizacion;
	private float descuento;
	private double total;
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
		if (this.cotizacion > 0 && this.descuento > 0)
			this.total = this.cotizacion - (this.cotizacion * this.descuento / 100);
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
