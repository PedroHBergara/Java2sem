package br.com.fiap.spring_mvc_08_08.service;

import br.com.fiap.spring_mvc_08_08.entity.Livro;
import br.com.fiap.spring_mvc_08_08.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired LivroService(LivroRepository livroRepository, LivroRepository livroRepository1) {


        this.livroRepository = livroRepository1;
    }


    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro readLivro(Long id){
        return livroRepository.findById(id).orElse(null);

    }
    public List<Livro> readLivros(){
        return livroRepository.findAll();
    }
    public Livro updateLivro(Livro livro){
        return livroRepository.save(livro);

    }
    public void deleteLivro(Long id){
        livroRepository.deleteById(id);
    }


}
