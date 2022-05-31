package com.jh.pandemicsystem.controller;

import com.jh.pandemicsystem.entity.request.HospitalRequest;
import com.jh.pandemicsystem.service.HospitalService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Hospitais", description = "Api Pandemic System - Hospitais")
@RequestMapping("/api/pandemic/hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @Operation(summary = "Método: Salvar", description = "Cria uma entidade Hospital na base de dados")
    @ApiResponse(responseCode = "201", description = "criação de Hospital executada com sucesso")
    @PostMapping("/salvar")
    public ResponseEntity<?> salvar(@RequestBody HospitalRequest hospital){
        this.hospitalService.salvar(hospital);
        return ResponseEntity.status(HttpStatus.CREATED).body(hospital);
    }

    @Operation(summary = "Método: Listar", description = "Lista todas as entidades Hospital existentes da base de dados")
    @ApiResponse(responseCode = "200", description = "listagem de Hospital executada com sucesso")
    @GetMapping("/listar")
    public ResponseEntity<?> listar(){return ResponseEntity.ok(this.hospitalService.listar());}

    @Operation(summary = "Método: Listar", description = "Lista uma entidade Hospital específica existente na base de dados")
    @ApiResponse(responseCode = "200", description = "listagem de Hospital executada com sucesso")
    @ApiResponse(responseCode = "500", description = "registro de Hospital não encontrado")
    @GetMapping("/listarPorId/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id){return ResponseEntity.ok(this.hospitalService.listarPorId(id));}

    @Operation(summary = "Método: Excluir", description = "Exclui uma entidade Hospital específica da base de dados")
    @ApiResponse(responseCode = "200", description = "exclusão de Hospital executada com sucesso")
    @ApiResponse(responseCode = "500", description = "exclusão de Hospital não efetuada")
    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        this.hospitalService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Operation(summary = "Método: Atualizar", description = "Atualiza uma entidade Hospital específica na base de dados")
    @ApiResponse(responseCode = "200", description = "atualização de Hospital executada com sucesso")
    @ApiResponse(responseCode = "500", description = "atualização de Hospital não efetuada")
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizar(@RequestBody HospitalRequest hospital, @PathVariable Long id){
        this.hospitalService.atualizar(hospital, id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
