package br.com.alurafood.pagamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    @GetMapping
    public String init() {
        return "teste";
    }
}
