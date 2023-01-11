package br.com.casellibusiness.casellimanager.usecases;

import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoRequest;
import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;

public interface SaveExpenseUseCase {

    ExpenseDtoResponse execute(ExpenseDtoRequest request);
}
