package com.dev.scottiere.ApiCadastroDeAutomoveis.repository;

import com.dev.scottiere.ApiCadastroDeAutomoveis.model.MontadoraModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MontadoraRepository extends JpaRepository< MontadoraModel,Long> {
}
