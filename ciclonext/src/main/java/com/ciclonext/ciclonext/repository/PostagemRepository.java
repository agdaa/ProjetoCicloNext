package com.ciclonext.ciclonext.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciclonext.ciclonext.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	

}
