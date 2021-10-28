package br.com.zup.Carros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @GetMapping("opala")
    public HashMap<String, String> exibirMotinha() {
        HashMap<String, String> Honda = new HashMap<>();
        Honda.put("Cor", "Azul");
        Honda.put("Ano", "1988");
        Honda.put("Motor", "2000");

        return Honda;
    }
}
