package com.jh.pandemicsystem.controller;

import com.jh.pandemicsystem.entity.Historico;
import com.jh.pandemicsystem.entity.Hospital;
import com.jh.pandemicsystem.entity.Recurso;
import com.jh.pandemicsystem.entity.response.HospitalResponse;
import com.jh.pandemicsystem.service.HistoricoService;
import com.jh.pandemicsystem.service.HospitalService;
import com.jh.pandemicsystem.service.RecursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@Tag(name = "Api Intercâmbio", description = "Api para intercâmbio de recurso entre hospitais")
@RequestMapping("/pandemic/api")
public class ApiIntercambioController {

    private final HospitalService hospitalService;
    private final RecursoService recursoService;
    private final HistoricoService historicoService;

    public ApiIntercambioController(HospitalService hospitalService, RecursoService recursoService, HistoricoService historicoService) {
        this.hospitalService = hospitalService;
        this.recursoService = recursoService;
        this.historicoService = historicoService;
    }

    @Operation(summary = "Método: Listar", description = "Lista todos os Hospitais cadastrados com taxa de ocupação acima de 90%")
    @GetMapping("/listar90mais")
    public List<HospitalResponse> listar90mais() {

        var lista = this.hospitalService.listar();
        ArrayList<HospitalResponse> lista90mais = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() >= 90)
                lista90mais.add(lista.get(i));
        }
        return lista90mais;
    }

    @Operation(summary = "Método: Listar", description = "Lista todos os Hospitais cadastrados com taxa de ocupação abaixo de 90%")
    @GetMapping("/listar90menos")
    public List<HospitalResponse> listar90menos() {

        var lista = this.hospitalService.listar();
        ArrayList<HospitalResponse> lista90menos = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() < 90)
                lista90menos.add(lista.get(i));
        }
        return lista90menos;
    }

    @Operation(summary = "Método: Listar", description = "Retorna o percentual de Hospitais com taxa de ocupação acima de 90%")
    @GetMapping("/porcent90mais")
    public String porcent90mais() {

        DecimalFormat df = new DecimalFormat("#.##");
        var lista = this.hospitalService.listar();

        ArrayList<HospitalResponse> lista90mais = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() >= 90)
                lista90mais.add(lista.get(i));
        }

        return df.format(lista90mais.size()*100.0/lista.size())+"%";
    }

    @Operation(summary = "Método: Listar", description = "Retorna o percentual de Hospitais com taxa de ocupação abaixo de 90%")
    @GetMapping("/porcent90menos")
    public String porcent90menos() {

        DecimalFormat df = new DecimalFormat("#.##");
        var lista = this.hospitalService.listar();
        ArrayList<HospitalResponse> lista90menos = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() < 90)
                lista90menos.add(lista.get(i));
        }

        return df.format(lista90menos.size()*100.0/lista.size())+"%";
    }

    @Operation(summary = "Método: Listar", description = "Lista Hospital com maior ocupação acima de 90%")
    @GetMapping("/maiorOcup90mais")
    public HospitalResponse maiorOcup90mais() {

        var lista = listar90mais();
        HospitalResponse maiorOcup90mais = new HospitalResponse();
        int temp = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() >= lista.get(temp).getTaxa_ocupacao()) {
                maiorOcup90mais = lista.get(i);
                temp++;
            }
        }
        return maiorOcup90mais;
    }

    @Operation(summary = "Método: Listar", description = "Lista Hospital com maior ocupação abaixo de 90%")
    @GetMapping("/maiorOcup90menos")
    public HospitalResponse maiorOcup90menos() {

        var lista = listar90menos();
        HospitalResponse maiorOcup90menos = new HospitalResponse();
        int temp = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTaxa_ocupacao() >= lista.get(temp).getTaxa_ocupacao()) {
                maiorOcup90menos = lista.get(i);
                temp++;
            }
        }
        return maiorOcup90menos;
    }

    @Operation(summary = "Método: Listar", description = "Lista média de recursos dos hospitais da rede")
    @GetMapping("/mediaRecursos")
    public List mediaRecursos() {
        var cont = this.hospitalService.listar().size();
        var lista = this.recursoService.listar();
        ArrayList<String> listMedia = new ArrayList<>();
        String recurso;
        String itemMedia;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < lista.size(); i++) {
            recurso = lista.get(i).getNome();
            double soma = 0.0;
            for (int i2 = 0; i2 < lista.size(); i2++) {
                if (recurso.equals(lista.get(i2).getNome())) {
                    soma += lista.get(i2).getEstoque();
                }
            }
            itemMedia = recurso + ": " + df.format(soma / cont);
            if (!listMedia.contains(itemMedia)) {
                listMedia.add(itemMedia);
            }
        }
        return listMedia;
    }

    @Operation(summary = "Método: Atualizar/Salvar", description = "Realiza intercâmbio de recursos entre hospitais da rede e salva a transação no histórico")
    @PostMapping("/solicitaRecurso")
    public void solicitaRecurso(Long id_solicitante, Recurso _recursoSolicitado, int qtdeSolicitada, Long id_fornecedor, Recurso _recursoFornecido, int qtdeFornecida) {
        Hospital solicitante = this.hospitalService.GetById(id_solicitante);
        Hospital fornecedor = this.hospitalService.GetById(id_fornecedor);
        Recurso recursoSolicitado = _recursoSolicitado;
        Recurso recursoFornecido = _recursoFornecido;
        int sumRecurso = 0;
        int subRecurso = 0;
        Historico historico = new Historico();

        int totalPtosSolicitacao = recursoSolicitado.getPontuacao() * qtdeSolicitada;
        int totalPtosFornecimento = recursoFornecido.getPontuacao() * qtdeFornecida;

        if ((totalPtosSolicitacao >= totalPtosFornecimento) || (solicitante.getTaxa_ocupacao() >= 90)){
            sumRecurso = recursoSolicitado.getEstoque() + qtdeSolicitada;
            recursoSolicitado.setEstoque(sumRecurso);
            this.recursoService.atualizar(recursoSolicitado, recursoSolicitado.getId());
            subRecurso = recursoFornecido.getEstoque() - qtdeFornecida;
            recursoSolicitado.setEstoque(subRecurso);
            this.recursoService.atualizar(recursoFornecido, recursoFornecido.getId());
        }
        historico.setHospFornecedor(solicitante);
        historico.setHospSolicitante(fornecedor);
        historico.setRecursoSolicitado(recursoSolicitado);
        historico.setRecursoFornecido(recursoFornecido);

        this.historicoService.salvar(historico);
    }

    @Operation(summary = "Método: Listar", description = "Lista o histórico de transações entre hospitais da rede")
    @PostMapping("/listarHistorico")
    public List listarHistorico() {
        return this.historicoService.listar();
    }
}
