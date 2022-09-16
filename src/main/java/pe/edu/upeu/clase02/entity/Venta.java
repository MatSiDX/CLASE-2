package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idventa;
	private String fecha;
	
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
