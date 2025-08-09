package br.com.fiap.spring_mvc_08_08.repository;


import br.com.fiap.spring_mvc_08_08.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
