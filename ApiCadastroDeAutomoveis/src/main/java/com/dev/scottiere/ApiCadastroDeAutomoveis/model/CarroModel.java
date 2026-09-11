package com.dev.scottiere.ApiCadastroDeAutomoveis;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_carros")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "marca")
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private Double preco;

    public  CarroModel(){

    }

    public CarroModel(String marca, String modelo, int anoFabricacao, Double preco) {

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;

    }


}
