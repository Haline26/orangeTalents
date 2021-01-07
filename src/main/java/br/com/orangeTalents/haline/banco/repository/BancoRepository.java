package br.com.orangeTalents.haline.banco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.orangeTalents.haline.banco.entity.Banco;

@Repository
public interface BancoRepository extends CrudRepository<Banco, Long> {

}
