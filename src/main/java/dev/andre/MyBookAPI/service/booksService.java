package dev.andre.mybookapi.service;


import dev.andre.MyBookAPI.model.books;
import dev.andre.MyBookAPI.repository.booksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Toda a lógica da aplicação vai aqui no Service
 */



@Service
public class booksService {

    /* TODO: Refatorar a instância */
    @Autowired
    private booksRepository repo;

    // Criar um novo livro
    // Faz a criação de um novo livro e insere no db
    public books createBook(books book) {
        return repo.save(book);
    }

    // Mostrar todos os livros criados
    // Faz uma consulta no db e devolve uma lista de livros
    public List<books> getAllBooks(){
        return repo.findAll();
    }

    public Optional<books> getBookById(Long id) {
        return repo.findById(id);
    }


    // Deletar livro por ID

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }



    // Atualizar livro



}
