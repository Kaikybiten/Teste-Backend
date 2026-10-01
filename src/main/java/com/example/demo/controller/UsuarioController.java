package com.example.demo.controller;

import com.example.demo.dto.usuario.CreateUsuarioDTO;
import com.example.demo.dto.usuario.UsuarioResponseDTO;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> save(
            @Valid @RequestBody CreateUsuarioDTO createUsuarioDTO
    ) {
        Usuario usuario = usuarioService.save(createUsuarioDTO);

        return ResponseEntity.status(201).body(
                new UsuarioResponseDTO(usuario)
        );
    }

}
