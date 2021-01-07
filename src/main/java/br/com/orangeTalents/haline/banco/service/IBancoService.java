package br.com.orangeTalents.haline.banco.service;

import br.com.orangeTalents.haline.banco.dto.MensagemDTO;
import br.com.orangeTalents.haline.banco.entity.Banco;

public interface IBancoService {

	public MensagemDTO adicionarConta(Banco banco);
}
