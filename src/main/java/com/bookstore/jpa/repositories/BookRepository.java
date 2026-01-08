package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository <BookModel, UUID>{
    //graças ao extends JPAREP.. podemos utilizar de todos os metodos
    //save, findById, findAll, delete... entre outros

    BookModel findBookModelByTitle (String title);




}
