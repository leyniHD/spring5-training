package guru.spring5.controllers;

import guru.spring5.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;
import sun.misc.Contended;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll()) ;
        return "books/list";
    }
}
