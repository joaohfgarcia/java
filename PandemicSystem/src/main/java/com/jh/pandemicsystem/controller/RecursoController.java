package com.jh.pandemicsystem.controller;

import com.jh.pandemicsystem.entity.Recurso;
import com.jh.pandemicsystem.service.RecursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Recursos", description = "Api Pandemic System - Recursos")
@RequestMapping("/api/pandemic/recurso")
public class RecursoController {

    private final RecursoService recursoService;

    public RecursoController(RecursoService recursoService) {
        this.recursoService = recursoService;
    }

    @Operation(summary = "Método: Salvar", description = "cria uma entidade Recurso na base de dados")
    @ApiResponse(responseCode = "201", description = "criação de Recurso executada com sucesso")
    @PostMapping("/salvar")
    public void salvar(Recurso recurso){
        this.recursoService.salvar(recurso);
    }

    @Operation(summary = "Método: Listar", description = "Lista todas as entidades Recurso existentes na base de dados")
    @ApiResponse(responseCode = "200", description = "listagem de Recurso executada com sucesso")
    @GetMapping("/listar")
    public List<Recurso> listar(){
        return this.recursoService.listar();
    }

    @Operation(summary = "Método: Listar", description = "Lista uma entidade Recurso específica existente na base de dados")
    @ApiResponse(responseCode = "200", description = "listagem de Recurso executada com sucesso")
    @ApiResponse(responseCode = "500", description = "registro de Recurso não encontrado")
    @GetMapping("/listarPorId/{id}")
    public Recurso listarPorId(Long id){
        return this.recursoService.listarPorId(id);
    }

    @Operation(summary = "Método: Excluir", description = "Exclui uma entidade Recurso específica da base de dados")
    @ApiResponse(responseCode = "200", description = "exclusão de Recurso executada com sucesso")
    @ApiResponse(responseCode = "500", description = "exclusão de Recurso não efetuada")
    @DeleteMapping("/excluir/{id}")
    public void excluir(Long id){
        this.recursoService.excluir(id);
    }

    @Operation(summary = "Método: Atualizar", description = "Atualiza uma entidade Recurso específica na base de dados")
    @ApiResponse(responseCode = "200", description = "atualização de Recurso executada com sucesso")
    @ApiResponse(responseCode = "500", description = "atualização de Recurso não efetuada")
    @PutMapping("/atualizar/{id}")
    public void atualizar(Recurso recurso, Long id){
        this.recursoService.atualizar(recurso, id);
    }

}
