package br.com.casellibusiness.casellimanager.usecases.impl;

import br.com.casellibusiness.casellimanager.domain.Expense;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;
import br.com.casellibusiness.casellimanager.domain.mappers.ExpenseMappers;
import br.com.casellibusiness.casellimanager.repositories.ExpenseRepository;
import br.com.casellibusiness.casellimanager.usecases.SaveExpenseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveExpenseUseCaseImpl implements SaveExpenseUseCase {

    private final ExpenseRepository expenseRepository;

    @Override
    public ExpenseDtoResponse execute(ExpenseDtoRequest request) {
        Expense domain = ExpenseMappers.fromRequest(request);
        return ExpenseMappers.toDto(expenseRepository.save(domain));
    }
}
