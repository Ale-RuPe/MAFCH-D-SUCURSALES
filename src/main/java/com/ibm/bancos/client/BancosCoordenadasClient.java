package com.ibm.bancos.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.bancos.model.BancoModel;

@FeignClient(name = "${client.coordenadas.name}", fallback =BancosCoordenadasClientFallback.class)
public interface BancosCoordenadasClient {
	
	@GetMapping("${client.coordenadas.uri}")
	public ResponseEntity<List<BancoModel>> getBancos(
			@RequestParam Double gpsCoordX,
			@RequestParam Double gpsCoordY);
}
