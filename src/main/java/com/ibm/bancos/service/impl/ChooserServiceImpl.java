package com.ibm.bancos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bancos.model.RetrieveSucursalesRequest;
import com.ibm.bancos.model.RetrieveSucursalesResponse;
import com.ibm.bancos.service.ChooserService;
import com.ibm.bancos.service.SucursalesService;

@Service
public class ChooserServiceImpl implements ChooserService{
	@Autowired
	SucursalesService service;
	
	@Override
	public RetrieveSucursalesResponse getRetrieve(RetrieveSucursalesRequest request) {
		RetrieveSucursalesResponse response = new RetrieveSucursalesResponse();  
				if(request.getEstado() != null) 
					response = service.retrieveBancosEstados(request.getEstado());
				else if(request.getZipcode() != null)
					response = service.retrieveBancosZipCode(request.getZipcode());
				else if(request.getGpsCoordX() != null && request.getGpsCoordY() != null)
					response = service.retrieveBancosCoordenadas( request.getGpsCoordX(), request.getGpsCoordY() ); 
		return response;
	}
	

}
