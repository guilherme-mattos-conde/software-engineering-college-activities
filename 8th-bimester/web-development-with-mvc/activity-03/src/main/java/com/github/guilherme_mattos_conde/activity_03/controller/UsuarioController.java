package com.github.guilherme_mattos_conde.activity_03.controller;

import com.github.guilherme_mattos_conde.activity_03.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping("/usuarios/novo")
    public boolean criarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return true;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(Usuario usuario) {
        return usuarios;
    }
}
