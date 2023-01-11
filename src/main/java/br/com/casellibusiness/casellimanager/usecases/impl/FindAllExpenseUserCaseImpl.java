package br.com.casellibusiness.casellimanager.usecases.impl;

import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;
import br.com.casellibusiness.casellimanager.domain.mappers.ExpenseMappers;
import br.com.casellibusiness.casellimanager.repositories.ExpenseRepository;
import br.com.casellibusiness.casellimanager.usecases.FindAllExpenseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class FindAllExpenseUserCaseImpl implements FindAllExpenseUseCase {

    private final ExpenseRepository expenseRepository;

    @Override
    public List<ExpenseDtoResponse> execute(){
        return this.expenseRepository.findAll()
                .stream().map(ExpenseMappers::toDto)
                .toList();
    }
}
