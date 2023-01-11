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
public class FixedCostsDtoResponse {

    private Long id;
    private List<ExpenseDtoResponse> expenses = new ArrayList<>();
    private LocalDateTime createdAt;
    private Double totalCost;
    private List<OnDemandSpendingDtoResponse> services = new ArrayList<>();

    private Double servicesTotalCost;
}
