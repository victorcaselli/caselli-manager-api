package br.com.casellibusiness.casellimanager.domain.mappers;

import br.com.casellibusiness.casellimanager.domain.Expense;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;
import br.com.casellibusiness.casellimanager.utils.ModelMapperUtils;

public class ExpenseMappers {

    public static ExpenseDtoResponse toDto(Expense domain){
        return ModelMapperUtils.map(domain, ExpenseDtoResponse.class);
    }

    public static Expense fromRequest(ExpenseDtoRequest request){
        return ModelMapperUtils.map(request, Expense.class);
    }
}
