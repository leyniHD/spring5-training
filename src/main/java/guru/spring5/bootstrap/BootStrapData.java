package guru.spring5.bootstrap;

import guru.spring5.domain.Author;
import guru.spring5.domain.Book;
import guru.spring5.repositories.AuthorRepository;
import guru.spring5.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData( AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book bbb = new Book("Design Systeme", "225252546215");
        eric.getBooks().add(bbb);
        bbb.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(bbb);

        Author ero = new Author("ERO", "COOL");
        Book cc = new Book("JAVA EE", "1234");
        ero.getBooks().add(cc);
        cc.getAuthors().add(ero);
        authorRepository.save(ero);
        bookRepository.save(cc);
        System.out.println("Adding book and autor + "  + bookRepository.count());
    }
}
