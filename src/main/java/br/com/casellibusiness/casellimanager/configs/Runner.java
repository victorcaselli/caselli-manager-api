package br.com.casellibusiness.casellimanager.configs;

import br.com.casellibusiness.casellimanager.domain.Expense;
import br.com.casellibusiness.casellimanager.domain.FixedCosts;
import br.com.casellibusiness.casellimanager.domain.OnDemandSpending;
import br.com.casellibusiness.casellimanager.repositories.ExpenseRepository;
import br.com.casellibusiness.casellimanager.repositories.FixedCostsRepository;
import br.com.casellibusiness.casellimanager.repositories.OnDemandSpendingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class Runner implements CommandLineRunner {

    private final ExpenseRepository expenseRepository;
    private final OnDemandSpendingRepository onDemandSpendingRepository;
    private final FixedCostsRepository fixedCostsRepository;

    @Override
    public void run(String... args) throws Exception {
        FixedCosts fixedCosts = FixedCosts.builder()
                .createdAt(LocalDateTime.now())
                .build();
        fixedCostsRepository.save(fixedCosts);

        Expense expense = Expense.builder()
                .createdAt(LocalDateTime.now())
                .cost(2214.0)
                .description("Casamento")
                .fixedCosts(fixedCosts)
                .build();
        expenseRepository.save(expense);

        OnDemandSpending onDemandSpending = OnDemandSpending.builder()
                .description("Netflix")
                .createdAt(LocalDateTime.now())
                .cost(54.90)
                .fixedCosts(fixedCosts)
                .build();
        onDemandSpendingRepository.save(onDemandSpending);

//        FixedCosts fixedCosts = FixedCosts.builder()
//                .createdAt(LocalDateTime.now())
//                .expenses(List.of(expense))
//                .services(List.of(onDemandSpending))
//                .build();
//
//        fixedCostsRepository.save(fixedCosts);
    }
}
