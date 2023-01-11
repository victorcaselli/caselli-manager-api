package br.com.casellibusiness.casellimanager.usecases.impl;

import br.com.casellibusiness.casellimanager.domain.OnDemandSpending;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoResponse;
import br.com.casellibusiness.casellimanager.domain.mappers.OnDemandSpendingMappers;
import br.com.casellibusiness.casellimanager.repositories.OnDemandSpendingRepository;
import br.com.casellibusiness.casellimanager.usecases.SaveOnDemandSpendingUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveOnDemandSpendingUseCaseImpl implements SaveOnDemandSpendingUseCase {

    private final OnDemandSpendingRepository onDemandSpendingRepository;

    @Override
    public OnDemandSpendingDtoResponse execute(OnDemandSpendingDtoRequest request) {
        OnDemandSpending domain = OnDemandSpendingMappers.fromRequest(request);
        return OnDemandSpendingMappers.toDto(onDemandSpendingRepository.save(domain));
    }
}
