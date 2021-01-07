package br.com.orangeTalents.haline.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orangeTalents.haline.banco.dto.MensagemDTO;
import br.com.orangeTalents.haline.banco.entity.Banco;
import br.com.orangeTalents.haline.banco.service.IBancoService;

@RestController
@RequestMapping("/banco")
public class BancoController {

	@Autowired
    IBancoService bancoService;
	
	@PostMapping(produces={ MediaType.TEXT_PLAIN_VALUE})
    public MensagemDTO adicionarConta(@RequestBody Banco banco) {
        return bancoService.adicionarConta(banco);
    }
}
