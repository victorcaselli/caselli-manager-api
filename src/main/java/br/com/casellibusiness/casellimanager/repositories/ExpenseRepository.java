package br.com.casellibusiness.casellimanager.repositories;

import br.com.casellibusiness.casellimanager.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
