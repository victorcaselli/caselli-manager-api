package br.com.casellibusiness.casellimanager.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExpenseDtoResponse {

    private Long id;
    private String description;
    private Double cost;
    private LocalDateTime createdAt;
}
