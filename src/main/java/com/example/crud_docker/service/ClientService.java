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

    public Cliente alterar(Long id, Cliente alterado) {
        Optional<Cliente> encontrado = clientRepository.findById(id);
        if(encontrado.isPresent()){
            Cliente cliente = encontrado.get();
            cliente.setNome(alterado.getNome());
            cliente.setIdade(alterado.getIdade());
            cliente.setDataNasci(alterado.getDataNasci());
            cliente.setSexo(alterado.getSexo());
            cliente.setDataCadastro(alterado.getDataCadastro());

            return clientRepository.save(cliente);
        }
        return null;
    }

    public void remover(Long id) {clientRepository.deleteById(id);

    }
}
