package br.com.ggp.avaliacao.repository;


import br.com.ggp.avaliacao.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostRepository extends JpaRepository<Cost, Long> {
    List<Cost> findAllByUserId(Long userId);

}
