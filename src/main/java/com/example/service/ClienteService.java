package com.example.service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Cliente;
import com.example.repository.ClienteRepository;
@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
   
   
    public Cliente cadastrar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
   
    public Collection<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    public void excluir(Cliente cliente){
        clienteRepository.delete(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findOne(id);
    }

    public Cliente alterar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}