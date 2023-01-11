package br.com.casellibusiness.casellimanager.usecases;

import br.com.casellibusiness.casellimanager.domain.dto.ExpenseDtoResponse;

import java.util.List;

public interface FindAllExpenseUseCase {

    List<ExpenseDtoResponse> execute();
}
