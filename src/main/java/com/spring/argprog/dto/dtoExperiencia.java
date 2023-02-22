package com.spring.argprog.dto;


public class dtoExperiencia {
	
	private int id;
	private String posicionE;
	private String empresaE;
	private String dataE;
	private String descripcionE;
	private String imagenE;
	
	public dtoExperiencia() {
	}

	public dtoExperiencia(String posicionE, String empresaE, String dataE, String descripcionE, String imagenE) {
		this.posicionE = posicionE;
		this.empresaE = empresaE;
		this.dataE = dataE;
		this.descripcionE = descripcionE;
		this.imagenE = imagenE;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getPosicionE() {
		return posicionE;
	}

	public void setPosicionE(String posicionE) {
		this.posicionE = posicionE;
	}

	public String getEmpresaE() {
		return empresaE;
	}

	public void setEmpresaE(String empresaE) {
		this.empresaE = empresaE;
	}

	public String getDataE() {
		return dataE;
	}

	public void setDataE(String dataE) {
		this.dataE = dataE;
	}

	public String getDescripcionE() {
		return descripcionE;
	}

	public void setDescripcionE(String descripcionE) {
		this.descripcionE = descripcionE;
	}

	public String getImagenE() {
		return imagenE;
	}

	public void setImagenE(String imagenE) {
		this.imagenE = imagenE;
	}
	
	
}
