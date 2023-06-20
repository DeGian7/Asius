package com.sphere.Asius.Services.implement;

import com.sphere.Asius.Entity.Books;
import com.sphere.Asius.Repository.BooksRepository;
import com.sphere.Asius.Services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class BooksSI implements BooksServices {
    @Autowired
    private BooksRepository booksRepository;
    @Override
    public Books agregarLibro(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public Books actualizarLibro(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public Set<Books> obtenerLibros() {
        return new LinkedHashSet<>(booksRepository.findAll());
    }

    @Override
    public Books obtenerLibros(Long idBooks) {
        return booksRepository.findById(idBooks).get();
    }

    @Override
    public void eliminarLibros(Long idBooks) {
        Books books = new Books();
        books.setIdBooks(idBooks);
        booksRepository.delete(books);
    }
}
