package com.example.demo.service;

import com.example.demo.dto.conta.CreateContaDTO;
import com.example.demo.model.Usuario;
import com.example.demo.repository.ContaRepository;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public Conta save(CreateContaDTO createContaDTO) {


    }
}
