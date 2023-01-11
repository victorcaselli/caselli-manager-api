package br.com.casellibusiness.casellimanager.domain.mappers;

import br.com.casellibusiness.casellimanager.domain.OnDemandSpending;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoResponse;
import br.com.casellibusiness.casellimanager.utils.ModelMapperUtils;

public class OnDemandSpendingMappers {

    public static OnDemandSpendingDtoResponse toDto(OnDemandSpending domain){
        return ModelMapperUtils.map(domain, OnDemandSpendingDtoResponse.class);
    }

    public static OnDemandSpending fromRequest(OnDemandSpendingDtoRequest request){
        return ModelMapperUtils.map(request, OnDemandSpending.class);
    }
}
