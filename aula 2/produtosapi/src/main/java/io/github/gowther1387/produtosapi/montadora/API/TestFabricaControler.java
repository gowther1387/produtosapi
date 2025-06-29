package io.github.gowther1387.produtosapi.montadora.API;

import io.github.gowther1387.produtosapi.montadora.CarroStatus;
import io.github.gowther1387.produtosapi.montadora.Chave;
import io.github.gowther1387.produtosapi.montadora.HondaHRV;
import io.github.gowther1387.produtosapi.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TestFabricaControler {

    @Autowired
    @Turbo
    public Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
