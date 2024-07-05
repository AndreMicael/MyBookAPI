package dev.andre.MyBookAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.andre.MyBookAPI.model.books;

/**
 * Interface de repositório para a entidade {@link books}.
 * <p>
 * Esta interface é responsável pela comunicação com o banco de dados, utilizando JPA (Java Persistence API)
 * para realizar operações CRUD (Create, Read, Update, Delete) na tabela "books" do banco de dados PostgreSQL.
 * </p>
 * <p>
 * Ao estender {@link JpaRepository}, herda vários métodos para manipulação de dados, como salvar, deletar e encontrar
 * entidades {@link books}. Também permite a definição de métodos de consulta personalizados.
 * </p>
 *
 * @see JpaRepository
 * @see books
 *
 * @autor André Sampaio
 */
public interface booksRepository extends JpaRepository<books, Long> {
}
