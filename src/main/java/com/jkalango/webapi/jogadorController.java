package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastroJogador;
import com.jkalango.webapi.jogadores.Jogador;
import com.jkalango.webapi.jogadores.JogadorRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/jogador")
public class jogadorController {
    @PostMapping
    @Autowired
    private JogadorRespository respository;
    public void cadastrar(@RequestBody DadosCadastroJogador dados){
        // System.out.println(dados);
        respository.save(new Jogador(dados));
    }
}
