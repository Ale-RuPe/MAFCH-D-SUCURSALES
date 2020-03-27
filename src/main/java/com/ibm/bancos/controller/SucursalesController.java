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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SucursalesController {
	@Autowired
	ChooserService service;
	
	@PostMapping("/api/v1/sucursales/retrieve")
	public ResponseEntity<RetrieveSucursalesResponse> retrieveSucursales(
			@RequestBody RetrieveSucursalesRequest request){
		RetrieveSucursalesResponse response = service.getRetrieve(request);
		log.info("Retrieving response: {}", response.getSucursales().size());
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
