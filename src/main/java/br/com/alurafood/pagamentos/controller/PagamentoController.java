package br.com.alurafood.pagamentos.controller;

import br.com.alurafood.pagamentos.model.Pagamento;
import br.com.alurafood.pagamentos.service.PagamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pagamento")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @GetMapping
    public String init() {
        return "teste";
    }

    @GetMapping
    public List<Pagamento> findAll() {
        return pagamentoService.findAll();
    }

    @GetMapping("/{id}")
    public Pagamento findById(@PathVariable Long id) {
        return pagamentoService.findById(id);
    }
}
