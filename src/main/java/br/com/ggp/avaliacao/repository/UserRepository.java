package br.com.ggp.avaliacao.repository;

import br.com.ggp.avaliacao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { }