package com.ibm.bancos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.bancos.model.RetrieveSucursalesResponse;

@FeignClient(name = "MAFCS-D-BANCOS-COORDENADAS")
public interface BancosCoordenadasClient {
	
	@GetMapping("/api/v1/bancos/coordenadas/")
	public ResponseEntity<RetrieveSucursalesResponse> getBancos(
			@RequestParam Double gpsCoordX,
			@RequestParam Double gpsCoordY);
}
