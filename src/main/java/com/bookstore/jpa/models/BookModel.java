package com.bookstore.jpa.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity                   // define essa clasee como uma tabela no DB
@Table(name = "TB_BOOK")  //definindo o nome no banco de dados
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.AUTO) //como vai ser gerado o id automatico
    private UUID id;

    @Column(nullable = false,unique = true) // vai ser uma coluna com os parametros dentro do ()
    private String title;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
