package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.dto.ClienteDTO;
import br.edu.fatecfranca.ecommerce.model.Cliente;
import br.edu.fatecfranca.ecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
    public Cliente salvar(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setUsername(clienteDTO.getUsername());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setPassword(clienteDTO.getPassword());
        return clienteRepository.save(cliente);
    }
    public Cliente remove(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteRepository.delete(cliente.get());
            return cliente.get();
        }
        return null;
    }
    public Cliente atualizar(Long id, ClienteDTO clienteDTO) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            cliente.get().setNome(clienteDTO.getNome());
            cliente.get().setUsername(clienteDTO.getUsername());
            cliente.get().setEmail(clienteDTO.getEmail());
            cliente.get().setPassword(clienteDTO.getPassword());
            return clienteRepository.save(cliente.get());
        }
        return null;
    }

}
