package org.example.oficina.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.oficina.dto.VeiculoRequestDTO;
import org.example.oficina.dto.VeiculoResponseDTO;
import org.example.oficina.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clientes", description = "Rotas para gerenciamento de Clientes")
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{idCliente}")
    public VeiculoResponseDTO buscarPorId(@PathVariable Long idCliente) {
        return clienteService.buscarPorIdCliente(idCliente);
    }

    @PostMapping
    public VeiculoResponseDTO cadastrar(@RequestBody VeiculoRequestDTO dto) {
        return clienteService.cadastrarCliente(dto);
    }


    @PutMapping("/{idCliente}")
    public VeiculoResponseDTO atualizar(@PathVariable Long idCliente, @RequestBody VeiculoRequestDTO dto) {
        return clienteService.atualizarCliente(idCliente, dto);
    }


    @DeleteMapping("/{idCliente}")
    public void deletar(@PathVariable Long idCliente) {
        clienteService.deletarCliente(idCliente);
    }
}

