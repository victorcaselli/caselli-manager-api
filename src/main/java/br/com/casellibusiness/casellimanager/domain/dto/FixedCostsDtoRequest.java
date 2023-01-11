package br.com.casellibusiness.casellimanager.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FixedCostsDtoRequest {

    private List<ExpenseDtoRequest> expenses = new ArrayList<>();
    private LocalDateTime createdAt;
    private Double totalCost;
    private List<OnDemandSpendingDtoRequest> services = new ArrayList<>();
}
