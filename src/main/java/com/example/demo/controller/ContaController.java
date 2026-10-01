package com.example.demo.controller;

import com.example.demo.dto.conta.ContaResponseDTO;
import com.example.demo.dto.conta.CreateContaDTO;

import com.example.demo.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @PostMapping
    public ResponseEntity<ContaResponseDTO> save(CreateContaDTO createContaDTO) {



    }

}
