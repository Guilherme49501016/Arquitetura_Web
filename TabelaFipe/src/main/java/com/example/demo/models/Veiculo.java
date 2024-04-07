package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "veiculo")
public class Veiculo {
	
	@Id
	private String id;
    private int TipoVeiculo;
    private String Valor;
    private String Marca;
    private String Modelo;
    private int AnoModelo;
    private String Combustivel;
    private String CodigoFipe;
    private String MesReferencia;
    private String SiglaCombustivel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTipoVeiculo() {
		return TipoVeiculo;
	}
	public void setTipoVeiculo(int tipoVeiculo) {
		TipoVeiculo = tipoVeiculo;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAnoModelo() {
		return AnoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		AnoModelo = anoModelo;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}
	public String getCodigoFipe() {
		return CodigoFipe;
	}
	public void setCodigoFipe(String codigoFipe) {
		CodigoFipe = codigoFipe;
	}
	public String getMesReferencia() {
		return MesReferencia;
	}
	public void setMesReferencia(String mesReferencia) {
		MesReferencia = mesReferencia;
	}
	public String getSiglaCombustivel() {
		return SiglaCombustivel;
	}
	public void setSiglaCombustivel(String siglaCombustivel) {
		SiglaCombustivel = siglaCombustivel;
	}

   
   
}
