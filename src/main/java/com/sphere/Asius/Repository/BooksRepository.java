package com.sphere.Asius.Repository;


import com.sphere.Asius.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {

}
