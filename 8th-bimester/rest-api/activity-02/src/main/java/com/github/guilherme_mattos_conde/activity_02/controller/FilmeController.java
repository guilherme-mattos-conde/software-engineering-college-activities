package com.github.guilherme_mattos_conde.activity_02.controller;

import com.github.guilherme_mattos_conde.activity_02.model.Filme;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private List<Filme> filmes = new ArrayList<>();
    private int ID = 0;

    @PostMapping("/novo")
    public boolean novoFilme(@RequestBody Filme filme) {
        filme.setId(++ID);
        filmes.add(filme);
        return true;
    }

    @GetMapping
    public ResponseEntity<List<Filme>> getFilmes() {
        return ResponseEntity.ok(filmes);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Filme>> getFilmesPorGenero(@RequestParam String genero) {
        List<Filme> filmesPorGenero = filmes.stream()
                .filter(f -> f.getGenero().equalsIgnoreCase(genero)).toList();

        return new ResponseEntity<>(filmesPorGenero, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getFilme(@PathVariable int id) {
        Filme filme = null;

        for (Filme f: filmes) {
            if (f.getId() == id) {
                filme = f;
            }
        }

        return new ResponseEntity<>(filme, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilme(@PathVariable int id) {
        boolean deletado = filmes.removeIf(f -> f.getId() == id);

        return deletado ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}