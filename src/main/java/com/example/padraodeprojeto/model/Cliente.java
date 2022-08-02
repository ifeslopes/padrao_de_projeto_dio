package com.example.padraodeprojeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Cliente{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nome;

@ManyToOne
private Endereco endereco;

}
