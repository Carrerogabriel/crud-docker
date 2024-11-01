package com.example.crud_docker.service;

import com.example.crud_docker.model.Cliente;
import com.example.crud_docker.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Cliente salvar(Cliente entity) {
        return clientRepository.save(entity);
    }

    public List<Cliente> buscarTodos() {
        return clientRepository.findAll();
    }

    public Cliente alterar(Long id, Cliente changed) {
        Optional<Cliente> encontrado = clientRepository.findById(id);
        if(encontrado.isPresent()){
            Cliente client = encontrado.get();
            client.setNome(changed.getNome());
            client.setIdade(changed.getIdade());
            client.setDataNasci(changed.getDataNasci());

            return clientRepository.save(client);
        }
        return null;
    }


    public void remover(Long id) {clientRepository.deleteById(id);

    }
}
