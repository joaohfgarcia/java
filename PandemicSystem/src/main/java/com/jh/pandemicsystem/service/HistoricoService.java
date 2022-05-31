package com.jh.pandemicsystem.service;

import com.jh.pandemicsystem.entity.Historico;
import com.jh.pandemicsystem.repository.HistoricoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService {

    private final HistoricoRepository historicoRepository;

    public HistoricoService(HistoricoRepository historicoRepository) {
        this.historicoRepository = historicoRepository;
    }

    public void salvar(Historico historico) {
        this.historicoRepository.save(historico);
    }

    public List<Historico> listar() {
        return this.historicoRepository.findAll();
    }


}
