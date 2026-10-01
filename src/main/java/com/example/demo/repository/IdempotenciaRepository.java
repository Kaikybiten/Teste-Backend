package com.example.demo.repository;

import com.example.demo.model.Idempotencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdempotenciaRepository extends JpaRepository<Idempotencia, Long> {

}
