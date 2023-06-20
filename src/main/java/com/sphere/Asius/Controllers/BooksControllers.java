package com.sphere.Asius.Controllers;

import com.sphere.Asius.Entity.Books;
import com.sphere.Asius.Services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BooksControllers {

    @Autowired
    private BooksServices  booksServices;

    @PostMapping("/agregar")
    public ResponseEntity<Books> guardarLibro(@RequestBody Books books){
        Books libroGuardado = booksServices.agregarLibro(books);
        return ResponseEntity.ok(libroGuardado);
    }


    @GetMapping("/{idBooks}")
    public Books listarLibrosPorId(@PathVariable("idBooks") Long idBooks){
        return booksServices.obtenerLibros(idBooks);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarLibro(){
        return ResponseEntity.ok(booksServices.obtenerLibros());
    }

    @PutMapping("/modificar")
    public Books actualizarLibro(@RequestBody Books books){
        return booksServices.actualizarLibro(books);
    }

    @DeleteMapping("/eliminar/{idBooks}")
    public void eliminarLibro(@PathVariable("idBooks") Long idBooks){
        booksServices.eliminarLibros(idBooks);
    }


}
