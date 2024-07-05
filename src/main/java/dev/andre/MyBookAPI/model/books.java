package dev.andre.MyBookAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa um livro na aplicação MyBookAPI.
 * <p>
 * Esta classe é mapeada para uma tabela chamada "books" no banco de dados.
 * </p>
 * <p>
 * A classe utiliza JPA (Java Persistence API) para a persistência de dados.
 * A anotação {@link Entity} indica que esta classe é uma entidade JPA.
 * A anotação {@link Table} especifica o nome da tabela no banco de dados.
 * A anotação {@link Id} é usada para definir o identificador único da entidade.
 * A anotação {@link GeneratedValue} é usada para gerar automaticamente o valor do ID.
 * </p>
 * <p>
 * Os atributos desta classe representam as colunas da tabela "books".
 * </p>
 * <p>
 * As anotações do Lombok {@link Data}, {@link AllArgsConstructor}, e {@link NoArgsConstructor} são usadas
 * para gerar automaticamente os métodos getters, setters, construtores, e outros métodos utilitários.
 * </p>
 *
 * @see Entity
 * @see Table
 * @see Id
 * @see GeneratedValue
 * @see Data
 * @see AllArgsConstructor
 * @see NoArgsConstructor
 *
 * @author André Sampaio
 */
@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class books {
    /**
     * O identificador único do livro.
     * <p>
     * Este valor é gerado automaticamente pelo banco de dados.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * O título do livro.
     */
    String title;

    /**
     * O autor do livro.
     */
    String author;

    /**
     * O número de páginas do livro.
     */
    int pages;

    /**
     * O ano de publicação do livro.
     */
    int year;

    /**
     * A URL da capa do livro.
     */
    String coverUrl;

    String genre;

    String editor;
    /*
      Construtor completo da classe books.
      <p>
      Este construtor é gerado automaticamente pela anotação {@link AllArgsConstructor}.
      </p>

      @param id O identificador único do livro.
     * @param title O título do livro.
     * @param author O autor do livro.
     * @param pages O número de páginas do livro.
     * @param year O ano de publicação do livro.
     * @param coverUrl A URL da capa do livro.
     */




}
