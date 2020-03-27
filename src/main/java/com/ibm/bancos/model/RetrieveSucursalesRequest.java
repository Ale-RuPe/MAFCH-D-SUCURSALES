package com.ibm.bancos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RetrieveSucursalesRequest {
	private String estado;
	private String zipcode;
	private Double gpsCoordX;
	private Double gpsCoordY;
}
