package br.com.casellibusiness.casellimanager.usecases.impl;

import br.com.casellibusiness.casellimanager.domain.Expense;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;
import br.com.casellibusiness.casellimanager.domain.dto.FixedCostsDtoResponse;
import br.com.casellibusiness.casellimanager.domain.dto.OnDemandSpendingDtoResponse;
import br.com.casellibusiness.casellimanager.domain.mappers.FixedCostsMappers;
import br.com.casellibusiness.casellimanager.repositories.FixedCostsRepository;
import br.com.casellibusiness.casellimanager.usecases.FindByIdFixedCostsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class FindByIdFixedCostsUseCaseImpl implements FindByIdFixedCostsUseCase {

    private final FixedCostsRepository fixedCostsRepository;

    //TODO - Crete a custom exception
    @Override
    public FixedCostsDtoResponse execute(Long id) {
        FixedCostsDtoResponse response = FixedCostsMappers.toDto(
                fixedCostsRepository.findById(id)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid id"))
        );

        changeTotalAmount(response);
        putServicesObjectIntoExpenses(response);

        return response;
    }

    private void changeTotalAmount(FixedCostsDtoResponse fixedCostsDtoResponse){
        Double serviceTotal = 0.0;

        for(OnDemandSpendingDtoResponse data : fixedCostsDtoResponse.getServices()) {
            serviceTotal += data.getCost();
        }

        fixedCostsDtoResponse.setServicesTotalCost(serviceTotal);

        Double expenseTotal = 0.0;

        for(ExpenseDtoResponse data : fixedCostsDtoResponse.getExpenses()){
            expenseTotal += data.getCost();
        }

        fixedCostsDtoResponse.setTotalCost(serviceTotal + expenseTotal);
    }

    private void putServicesObjectIntoExpenses(FixedCostsDtoResponse response){
        response.getExpenses().add(
                ExpenseDtoResponse.builder()
                        .id(0L)
                        .description("Services")
                        .cost(response.getServicesTotalCost())
                        .build()
        );
    }
}
