package com.ibm.bancos.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RetrieveSucursalesResponse {
	private List<BancoModel> sucursales;
}
