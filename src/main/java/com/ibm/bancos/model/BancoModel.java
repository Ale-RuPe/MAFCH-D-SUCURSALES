package com.ibm.bancos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BancoModel {
	  private String horaApertura;

	  private String horaCierre;

	  private String direccion;

	  private String estado;

	  private String nombre;

	  private String tipoSucursal;

	  private String telefono;

}