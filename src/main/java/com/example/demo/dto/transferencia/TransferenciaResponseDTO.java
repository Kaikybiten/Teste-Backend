package com.example.demo.dto.transferencia;

import java.time.LocalDateTime;

public class TransferenciaResponseDTO {

    private Long id;
    private Long contaOrigemId;
    private Long contaDestinoId;
    private Long valorCentavos;
    private Long taxaCentavos;
    private String estado;
    private LocalDateTime criadaEm;
    private LocalDateTime concluidaEm;

    public TransferenciaResponseDTO(
            Long id,
            Long contaOrigemId,
            Long contaDestinoId,
            Long valorCentavos,
            Long taxaCentavos,
            String estado,
            LocalDateTime criadaEm,
            LocalDateTime concluidaEm
    ) {
        this.id = id;
        this.contaOrigemId = contaOrigemId;
        this.contaDestinoId = contaDestinoId;
        this.valorCentavos = valorCentavos;
        this.taxaCentavos = taxaCentavos;
        this.estado = estado;
        this.criadaEm = criadaEm;
        this.concluidaEm = concluidaEm;
    }

    public Long getId() {
        return id;
    }

    public Long getContaOrigemId() {
        return contaOrigemId;
    }

    public Long getContaDestinoId() {
        return contaDestinoId;
    }

    public Long getValorCentavos() {
        return valorCentavos;
    }

    public Long getTaxaCentavos() {
        return taxaCentavos;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getCriadaEm() {
        return criadaEm;
    }

    public LocalDateTime getConcluidaEm() {
        return concluidaEm;
    }
}