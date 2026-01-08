package com.bookstore.jpa.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity                   // define essa clasee como uma tabela no DB
@Table(name = "TB_BOOK")  //definindo o nome no banco de dados
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L; //define a versão da classe para controle de compatibilidade na serialização

    @Id //chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.AUTO) //como vai ser gerado o id automatico
    private UUID id;

    @Column(nullable = false,unique = true) // vai ser uma coluna com os parametros dentro do ()
    private String title;


    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne //(fetch = FetchType.LAZY) -> carregamento lento
    //indica o relacionamento VARIOS livros p/ UMA editora, feito um lado do relacionamento
    @JoinColumn (name = "publisher_id") //especificando a chave estrangeira na tb_book que vai relacionar com a tb_pubisher
    //o dono do relacionamento é quem tem a FK (chave estrangeira )
    //Foreign Key é a coluna que aponta para a Primary Key de outra tabela
    private PublisherModel publisher;

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

    public PublisherModel getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherModel publisher) {
        this.publisher = publisher;
    }
}
