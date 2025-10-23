package com.github.guilherme_mattos_conde.activity_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/api/teste")
    public String teste() {
        return "<h1>Teste</h1>" +
                "<p>Testando</p>";
    }
}
