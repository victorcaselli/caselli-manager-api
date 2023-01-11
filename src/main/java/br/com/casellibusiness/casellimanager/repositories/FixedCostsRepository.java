package br.com.casellibusiness.casellimanager.repositories;

import br.com.casellibusiness.casellimanager.domain.FixedCosts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedCostsRepository extends JpaRepository<FixedCosts, Long> {
}
