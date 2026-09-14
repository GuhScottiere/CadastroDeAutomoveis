package com.dev.scottiere.ApiCadastroDeAutomoveis.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_carros")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "marca")
    private String marca;
    @Column(unique = true)
    private String modelo;
    private int anoFabricacao;
    private Double preco;

    @ManyToOne
    private MontadoraModel montadoraModel;




}
