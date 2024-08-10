package br.com.ggp.avaliacao.repository;

import br.com.ggp.avaliacao.model.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {
  List<Revenue> findAllByUserId(Long userId);
}