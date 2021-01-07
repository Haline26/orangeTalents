package br.com.orangeTalents.haline.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.orangeTalents.haline.banco.dto.MensagemDTO;
import br.com.orangeTalents.haline.banco.entity.Banco;
import br.com.orangeTalents.haline.banco.repository.BancoRepository;

@Service
public class BancoService implements IBancoService {
	
	private static final String CADASTRO_REALIZADO_COM_SUCESSO = "Cadastro realizado com sucesso.";
	private static final String CONTA_JA_CADASTRADA = "Esse cpf já está cadastrado em nosso banco.";
	
	
	@Autowired
    BancoRepository bancoRepository;

	public MensagemDTO adicionarConta(Banco banco) {

        if (bancoRepository.existsById(banco.getCpf())) {
            return new MensagemDTO(CONTA_JA_CADASTRADA);
        }

        bancoRepository.save(banco);
        return new MensagemDTO(CADASTRO_REALIZADO_COM_SUCESSO);
    }
}
