package com.ibm.bancos.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.bancos.model.BancoModel;

@FeignClient(name = "${client.estado.name}", fallback = BancosEstadoClientFallback.class)
public interface BancosEstadoClient {
	
	@GetMapping("${client.estado.uri}")
	public ResponseEntity<List<BancoModel>> getBancos(@PathVariable String state);
}
