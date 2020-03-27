package com.ibm.bancos.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.bancos.model.BancoModel;

@FeignClient(name = "MAFCS-D-BANCOS-COORDENADAS")
public interface BancosCoordenadasClient {
	
	@GetMapping("/api/v1/bancos/coordenadas/")
	public ResponseEntity<List<BancoModel>> getBancos(
			@RequestParam Double gpsCoordX,
			@RequestParam Double gpsCoordY);
}
