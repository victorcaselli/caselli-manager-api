package br.com.casellibusiness.casellimanager.usecases;

import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoResponse;

public interface SaveOnDemandSpendingUseCase {
    OnDemandSpendingDtoResponse execute(OnDemandSpendingDtoRequest request);
}
