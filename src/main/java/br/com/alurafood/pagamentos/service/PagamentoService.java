package br.com.alurafood.pagamentos.service;

import br.com.alurafood.pagamentos.model.Pagamento;
import br.com.alurafood.pagamentos.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PagamentoService {

    private final PagamentoRepository repository;

    public List<Pagamento> findAll() {
        return repository.findAll();
    }
}
