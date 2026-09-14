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
@Table(name = "tb_montadora")
public class MontadoraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String NomeMontadora;
    private String paisDeOrigem;
    @OneToMany
    private List<CarroModel> carros;

}
