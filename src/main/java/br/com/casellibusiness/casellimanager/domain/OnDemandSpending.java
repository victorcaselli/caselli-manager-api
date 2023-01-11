package br.com.casellibusiness.casellimanager.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "CM_ODS")
public class OnDemandSpending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double cost;
    private LocalDateTime createdAt;
    @ManyToOne
    private FixedCosts fixedCosts;
}
