package com.ibm.bancos.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ibm.bancos.model.BancoModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BancosZipCodeFallback implements BancosZipCodeClient{

	@Override
	public ResponseEntity<List<BancoModel>> getBancos(String zipcode) {
		log.info("Fallback method feign");
		List<BancoModel> bancos = new ArrayList<>();
		BancoModel banco = new BancoModel();
		bancos.add(banco);
		return new ResponseEntity<>(bancos,HttpStatus.OK);
	}

}