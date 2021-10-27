package br.com.zup.Carros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class CarroController {

    @GetMapping ("/carro/fusca")
    @ResponseBody
    public HashMap<String, String> exibirFusca(){
        HashMap<String, String> fusca = new HashMap<>();
        fusca.put("Cor", "Preto");
        fusca.put("Ano","1984");
        fusca.put("Motor","1000");

        return fusca;
    }
}
