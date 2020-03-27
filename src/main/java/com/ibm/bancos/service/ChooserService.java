package com.ibm.bancos.service;

import com.ibm.bancos.model.RetrieveSucursalesRequest;
import com.ibm.bancos.model.RetrieveSucursalesResponse;

public interface ChooserService {
	RetrieveSucursalesResponse getRetrieve(RetrieveSucursalesRequest request);
}
