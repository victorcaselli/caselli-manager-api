package br.com.casellibusiness.casellimanager.domain;

import jakarta.persistence.*;
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
@Entity
@Table(name = "CM_FIXED_COSTS")
public class FixedCosts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "fixedCosts")
    private List<Expense> expenses = new ArrayList<>();
    private LocalDateTime createdAt;
    private Double totalCost;

    @OneToMany(mappedBy = "fixedCosts")
    private List<OnDemandSpending> services = new ArrayList<>();

    private Double servicesTotalCost;

}
