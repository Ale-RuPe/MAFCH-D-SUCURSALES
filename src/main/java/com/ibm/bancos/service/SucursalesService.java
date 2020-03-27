package com.ibm.bancos.service;

import com.ibm.bancos.model.RetrieveSucursalesResponse;

public interface SucursalesService {
	
	RetrieveSucursalesResponse retrieveBancosEstados(String estado);
	
	RetrieveSucursalesResponse retrieveBancosZipCode(String zipcode);
	
	RetrieveSucursalesResponse retrieveBancosCoordenadas(Double xCoor,Double yCoord);
}
