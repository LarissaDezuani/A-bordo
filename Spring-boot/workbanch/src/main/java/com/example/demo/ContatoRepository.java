


package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
}
