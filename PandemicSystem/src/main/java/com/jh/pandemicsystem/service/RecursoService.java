package com.jh.pandemicsystem.service;

import com.jh.pandemicsystem.entity.Recurso;
import com.jh.pandemicsystem.repository.RecursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    private final RecursoRepository recursoRepository;

    public RecursoService(RecursoRepository recursoRepository) {
        this.recursoRepository = recursoRepository;
    }

    public void salvar(Recurso recurso) {
        this.recursoRepository.save(recurso);
    }

    public List<Recurso> listar() {
        return this.recursoRepository.findAll();
    }

    public Recurso listarPorId(Long id) {
        return this.recursoRepository.findById(id).get();
    }

    public void excluir(Long id) {
        this.recursoRepository.deleteById(id);
    }

    public void atualizar(Recurso recurso, Long id) {
        recurso.setId(id);
        this.recursoRepository.save(recurso);
    }

}