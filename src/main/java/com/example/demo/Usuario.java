package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Table(name = "tb_usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
}