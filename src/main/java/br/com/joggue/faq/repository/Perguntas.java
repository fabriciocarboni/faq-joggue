package br.com.joggue.faq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joggue.faq.model.Pergunta;

public interface Perguntas extends JpaRepository<Pergunta, Long>{

}
