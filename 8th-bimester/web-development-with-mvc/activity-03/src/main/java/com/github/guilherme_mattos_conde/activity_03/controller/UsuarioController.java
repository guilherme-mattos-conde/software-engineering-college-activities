package com.github.guilherme_mattos_conde.activity_03.controller;

import com.github.guilherme_mattos_conde.activity_03.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @PostMapping("/usuarios/novo")
    public boolean criarUsuario(Usuario usuario) {
        System.out.println(usuario);
        return true;
    }
}
