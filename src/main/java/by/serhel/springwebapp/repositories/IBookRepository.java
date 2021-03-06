package by.serhel.springwebapp.repositories;

import by.serhel.springwebapp.entities.Book;
import by.serhel.springwebapp.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IBookRepository extends CrudRepository<Book, Long> {
    List<Book> findByGenre(String genre);
    List<Book> findByAuthor(User user);
    List<Book> findByBookName(String searchText);
    void deleteAllByAuthor(User user);
}
