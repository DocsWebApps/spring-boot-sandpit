package com.docswebapps.spring5guru.bootstrap;

import com.docswebapps.spring5guru.domain.Author;
import com.docswebapps.spring5guru.domain.Book;
import com.docswebapps.spring5guru.domain.Publisher;
import com.docswebapps.spring5guru.repository.AuthorRepository;
import com.docswebapps.spring5guru.repository.BookRepository;
import com.docswebapps.spring5guru.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Dave Collier on 28/07/2017.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public DevBootstrap(PublisherRepository publisherRepository,
                        AuthorRepository authorRepository,
                        BookRepository bookRepository) {
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        // Add publisher "Harper Collins"
        Publisher harperCollins=new Publisher();
        harperCollins.setName("Harper Collins");
        publisherRepository.save(harperCollins);

        // Add publisher "Wrox"
        Publisher wrox=new Publisher();
        wrox.setName("Wrox");
        publisherRepository.save(wrox);

        // Add author Eric Evans
        Author eric=new Author("Eric", "Evans");
        Book ddd= new Book("Domain Driven Design",  "1234", harperCollins);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Add author Rod Johnson - founder of Spring
        Author rod=new Author("Rod", "Johnson");
        Book noEJB=new Book("J2EE Development without EJB", "23444", wrox);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
