package com.example.crud_docker.service;

import com.example.crud_docker.model.Cliente;
import com.example.crud_docker.model.Endereco;
import com.example.crud_docker.repository.ClientRepository;
import com.example.crud_docker.repository.EndereçoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    @Autowired
    private EndereçoRepository endereçoRepository;

    public Endereco salvar(Endereco entity) {
        return endereçoRepository.save(entity);
    }

    public List<Endereco> buscarTodos() {
        return endereçoRepository.findAll();
    }

    public Endereco alterar(Long id, Endereco alterado) {
        Optional<Endereco> encontrado = endereçoRepository.findById(id);
        if(encontrado.isPresent()){
            Endereco endereco = encontrado.get();
            endereco.setCidade(alterado.getCidade());
            endereco.setEstado(alterado.getEstado());
            endereco.setRua(alterado.getRua());
            endereco.setDataCadastro(alterado.getDataCadastro());

            return endereçoRepository.save(endereco);
        }
        return null;
    }

    public void remover(Long id) {endereçoRepository.deleteById(id);

    }
}
