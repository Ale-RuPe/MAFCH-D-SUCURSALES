package com.ibm.bancos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bancos.client.BancosCoordenadasClient;
import com.ibm.bancos.client.BancosEstadoClient;
import com.ibm.bancos.model.RetrieveSucursalesResponse;
import com.ibm.bancos.service.SucursalesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SucursalesServiceImpl implements SucursalesService{
	@Autowired
	BancosEstadoClient bancosEstadoClient;
	
	@Autowired
	BancosCoordenadasClient bancosCoordenadasClient;
	
	
	@Override
	public RetrieveSucursalesResponse retrieveBancosEstados(String estado) {
		log.info("Calling external service");
		RetrieveSucursalesResponse response = new RetrieveSucursalesResponse();
		response.setSucursales( bancosEstadoClient.getBancos(estado).getBody() );
		log.info("External service returned 200 OK");
		
		return response;
	}

	@Override
	public RetrieveSucursalesResponse retrieveBancosZipCode(String zipcode) {
		
		return null;
	}

	@Override
	public RetrieveSucursalesResponse retrieveBancosCoordenadas(Double xCoor, Double yCoord) {
		RetrieveSucursalesResponse response = bancosCoordenadasClient.getBancos(xCoor, yCoord).getBody();
		log.info("retieve?:{}",response.getSucursales().size());
		return response;
	}
	
}
