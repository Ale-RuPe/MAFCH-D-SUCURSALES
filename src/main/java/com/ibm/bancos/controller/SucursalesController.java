package com.ibm.bancos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bancos.model.RetrieveSucursalesRequest;
import com.ibm.bancos.model.RetrieveSucursalesResponse;
import com.ibm.bancos.service.ChooserService;
import com.ibm.bancos.service.SucursalesService;

@RestController
public class SucursalesController {
	@Autowired
	ChooserService service;
	
	@PostMapping("/api/v1/sucursales/retrieve")
	public ResponseEntity<RetrieveSucursalesResponse> retrieveSucursales(
			@RequestBody RetrieveSucursalesRequest request){
		
		return service.getRetrieve(request);
	}
	
}
