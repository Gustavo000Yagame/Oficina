package org.example.oficina.service;

import org.example.oficina.dto.ClienteRequestDTO;
import org.example.oficina.dto.ClienteResponseDTO;
import org.example.oficina.dto.VeiculoRequestDTO;
import org.example.oficina.exception.RecursoNaoEncontradoException;
import org.example.oficina.model.Cliente;
import org.example.oficina.model.Veiculo;
import org.example.oficina.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteResponseDTO> listarTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    public ClienteResponseDTO buscarPorIdCliente(Long idVeiculo) {
        Cliente Cliente = clienteRepository.findById(idVeiculo)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Veículo não encontrado"));

        return converterParaResponse(Cliente);
    }

    public ClienteResponseDTO cadastrarCliente(Long idCliente) {
        Cliente cliente = clienteRepository.findById(dto.clienteId())
                .orElseThrow(() -> new RuntimeException("Não foi possivel cadastrar o cliente"));

        cliente.setNome(dto.);
        cliente.setEmail(dto.);
        cliente.setTelefone(dto.);

        cliente salvo = clienteRepository.save(cliente);

        return converterParaResponse(salvo);
    }

    public ClienteResponseDTO atualizarCliente(Long idVeiculo, ClienteRequestDTO dto) {
        Cliente Cliente = ClienteRepository.findById(idVeiculo)
                .orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));
        //TODO: adicionar a exception

        Cliente cliente = clienteRepository.findById(dto.clienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        //TODO: adicionar a exception

        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());


        Cliente atualizado = clienteRepository.save(cliente);

        return converterParaResponse(atualizado);
    }

    public void deletar(Long idVeiculo) {
        Cliente Cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));
        clienteRepository.findById(idCliente)

    }
}


