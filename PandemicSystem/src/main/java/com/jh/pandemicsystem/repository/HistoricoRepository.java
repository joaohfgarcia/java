package com.jh.pandemicsystem.repository;

import com.jh.pandemicsystem.entity.Historico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long> {
}
