package com.ibm.bancos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bancos.model.RetrieveSucursalesRequest;
import com.ibm.bancos.model.RetrieveSucursalesResponse;
import com.ibm.bancos.properties.Properties;
import com.ibm.bancos.service.ChooserService;
import com.ibm.bancos.validator.Validator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SucursalesController {
	@Autowired
	ChooserService service;
	
	@Autowired
	Validator validator;
	
	@Autowired
	Properties prop;
	
	@PostMapping("${controller.uri}")
	public ResponseEntity<RetrieveSucursalesResponse> retrieveSucursales(@RequestHeader HttpHeaders httpHeaders,
			@RequestBody RetrieveSucursalesRequest request){
		
		log.info("Headers {}", httpHeaders.toString());
		validator.validateHeaders(httpHeaders.toSingleValueMap());
		
		log.info("Controller receiving data {}",request);
		validator.validateParams(request);
		
		RetrieveSucursalesResponse response = service.getRetrieve(request);
		log.info("Retrieving response: {}", response.getSucursales().size());

		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
