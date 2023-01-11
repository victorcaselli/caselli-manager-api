package br.com.casellibusiness.casellimanager.usecases;

import br.com.casellibusiness.casellimanager.domain.dto.FixedCostsDtoResponse;

public interface FindByIdFixedCostsUseCase {

    FixedCostsDtoResponse execute(Long id);
}
