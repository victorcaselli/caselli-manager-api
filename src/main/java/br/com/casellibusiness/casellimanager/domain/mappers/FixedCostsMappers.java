package br.com.casellibusiness.casellimanager.domain.mappers;

import br.com.casellibusiness.casellimanager.domain.FixedCosts;
import br.com.casellibusiness.casellimanager.domain.dto.FixedCostsDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.FixedCostsDtoResponse;
import br.com.casellibusiness.casellimanager.utils.ModelMapperUtils;

public class FixedCostsMappers {

    public static FixedCostsDtoResponse toDto(FixedCosts domain){
        return ModelMapperUtils.map(domain, FixedCostsDtoResponse.class);
    }

    public static FixedCosts fromRequest(FixedCostsDtoRequest request){
        return ModelMapperUtils.map(request, FixedCosts.class);
    }
}
