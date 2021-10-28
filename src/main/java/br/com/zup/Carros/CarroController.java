package br.com.zup.Carros;

import dtos.CarroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")

public class CarroController {
    private List<CarroDTO> listaCarros = new ArrayList<>();

    @GetMapping
    private List<CarroDTO> exibirCarros() {
        return listaCarros;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO) {
        listaCarros.add(carroDTO);
    }

    @GetMapping("/{nomeCarro}")
   /* public CarroDTO exibirCarro(@PathVariable String nomeCarro) {
        for (CarroDTO referencia : listaCarros) {
            if (referencia.getModelo().equals(nomeCarro)) {
                return referencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

}*/
    public CarroDTO exibirCarro(@PathVariable String nomeCarro) {
        Optional<CarroDTO> optionalCarroDTO = listaCarros.stream().filter(referencia -> referencia.getModelo().
                equalsIgnoreCase(nomeCarro)).findFirst();
        if (optionalCarroDTO.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrado");
        }
        return optionalCarroDTO.get();
    }

    @PutMapping("/{atualizarCarro}")
    public CarroDTO atualizarCarro(@PathVariable String atualizaCarro, @RequestBody CarroDTO carroDTO) {
        for (CarroDTO referencia : listaCarros) {
            if (referencia.getModelo().equalsIgnoreCase(atualizaCarro)) {
                referencia.setAno(carroDTO.getAno());
                referencia.setCor(carroDTO.getCor());
                referencia.setMotor(carroDTO.getMotor());
                return referencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
