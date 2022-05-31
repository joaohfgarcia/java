package com.jh.pandemicsystem.service;

import com.jh.pandemicsystem.entity.Hospital;
import com.jh.pandemicsystem.entity.request.HospitalRequest;
import com.jh.pandemicsystem.entity.response.HospitalResponse;
import com.jh.pandemicsystem.repository.HospitalRepository;
import com.jh.pandemicsystem.utils.ConvertUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;
    private final ConvertUtils convertUtils;

    public HospitalService(HospitalRepository hospitalRepository, ConvertUtils convertUtils) {
        this.hospitalRepository = hospitalRepository;
        this.convertUtils = convertUtils;
    }

    public void salvar(@RequestBody HospitalRequest hospital) {
        this.hospitalRepository.save(
                (Hospital) convertUtils.convertRequestToEntity(hospital, Hospital.class));
    }

    public List<HospitalResponse> listar() {
        return (List<HospitalResponse>) convertUtils
                .convertToListResponse(this.hospitalRepository.findAll(), HospitalResponse.class);
    }

    public HospitalResponse listarPorId(Long id) {
        return (HospitalResponse) convertUtils
                .convertEntityToResponse(this.hospitalRepository.findById(id).get(), HospitalResponse.class);
    }

    public List<Hospital> GetAll() {
        return this.hospitalRepository.findAll();
    }

    public Hospital GetById(Long id) {
        return this.hospitalRepository.findById(id).get();
    }

    public void excluir(Long id) {
        this.hospitalRepository.deleteById(id);
    }

    public void atualizar(@RequestBody HospitalRequest hospital, Long id) {
        var hospitalDb = this.hospitalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entidade não encontrada"));

        var hospitalAtualizado =
                (Hospital) convertUtils.convertRequestToEntity(hospital, hospitalDb.getClass());

        hospitalAtualizado.setId(id);

        this.hospitalRepository.save(hospitalAtualizado);
    }
}





