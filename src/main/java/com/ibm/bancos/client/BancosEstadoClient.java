package com.ibm.bancos.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.bancos.model.BancoModel;

@FeignClient(name = "MAFCS-D-BANCOS-ESTADO")
public interface BancosEstadoClient {
	
	@GetMapping("/api/v1/bancos/estado/{state}")
	public ResponseEntity<List<BancoModel>> getBancos(@PathVariable String state);
}
