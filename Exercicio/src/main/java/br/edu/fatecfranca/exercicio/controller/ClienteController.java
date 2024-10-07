package br.edu.fatecfranca.exercicio.controller;

import br.edu.fatecfranca.exercicio.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteController {

    private static Map<Long, Cliente> clientes = new HashMap<>();
    static{
clientes.put(1l, new Cliente(1l, "Pedro", "pedro@pedro.com", "99999-6666"));
clientes.put(2l, new Cliente (2l, "jose", "jose@jose.com", "99999-7777"));
clientes.put(3l, new Cliente(3l, "Mario","atrasdoarmario@mario.com","99999-8888" ));

    }

    @GetMapping("/cliente/{id}")
    public Cliente findById(@PathVariable Long id){
        Cliente cliente = clientes.get(id);
        if(cliente == null){
            return cliente;
        }
        else{
            return new Cliente(0l,"Cliente não encontrado", "Null", "Null" );
        }
    }
    @GetMapping("/cliente")
    public Map<Long, Cliente> findAll(){
        return clientes;
    }

    @PostMapping("/cliente")
    public Cliente add(@RequestBody Cliente cliente){
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }
    @DeleteMapping("/cliente/{id}")
    public String delete(@PathVariable Long id){
        Cliente cliente = clientes.remove(id);
        if(cliente == null){
            return"Removido com sucesso";
        }
        else{
            return "Produto não encontrado";
        }
    }
    @PutMapping("/cliente/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente clienteExistente = clientes.get(id);
        if(clienteExistente == null){
            clienteExistente.setName(cliente.getName());
            clienteExistente.setEmail(cliente.getEmail());
            clientes.put(id, clienteExistente);
            return "Cadastro de cliente atualizado";
        }
        else{
            return "Cliente não encontrado";

        }
    }

}
