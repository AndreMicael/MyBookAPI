package dev.andre.MyBookAPI.controller;
import dev.andre.MyBookAPI.model.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dev.andre.mybookapi.service.booksService;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/books")
public class booksController {

    @Autowired
    private booksService service;


    //localhost:8080/api/addBook
    // Método POST

    @CrossOrigin("*")
    @PostMapping("/add")

    public ResponseEntity<books> addBook(@RequestBody books book) {
        books newBook = service.createBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }
    //localhost:8080/api/all
    /*Método GET*/
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<List<books>> getAllBooks() {
        List<books> allBooks = service.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK );
    }

    /*Metodo GET por id*/
    @CrossOrigin("*")
    @GetMapping("/{id}")
    public ResponseEntity<books> getBookById(@PathVariable Long id) {
        Optional<books> book = service.getBookById(id);
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    //localhost:8080/api/delete/1
    /*Método Delete by ID */
    @CrossOrigin("*")
    /*TODO: usar option para tratar casos em que o usuario passe um ID invalido*/
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);

    }






}
