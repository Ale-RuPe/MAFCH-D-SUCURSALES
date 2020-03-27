package com.ibm.bancos.service;

import org.springframework.http.ResponseEntity;

import com.ibm.bancos.model.RetrieveSucursalesRequest;
import com.ibm.bancos.model.RetrieveSucursalesResponse;

public interface ChooserService {
	ResponseEntity<RetrieveSucursalesResponse> getRetrieve(RetrieveSucursalesRequest request);
}
