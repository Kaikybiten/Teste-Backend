package com.example.demo.dto.agendamento;

import java.time.LocalDateTime;

public class AgendamentoResponseDTO {

    private Long id;
    private Long contaOrigemId;
    private Long contaDestinoId;
    private Long valorCentavos;
    private LocalDateTime executarEm;
    private String estado;
    private Long tentativas;
    private Long transferenciaId;

    public AgendamentoResponseDTO(
            Long id,
            Long contaOrigemId,
            Long contaDestinoId,
            Long valorCentavos,
            LocalDateTime executarEm,
            String estado,
            Long tentativas,
            Long transferenciaId
    ) {
        this.id = id;
        this.contaOrigemId = contaOrigemId;
        this.contaDestinoId = contaDestinoId;
        this.valorCentavos = valorCentavos;
        this.executarEm = executarEm;
        this.estado = estado;
        this.tentativas = tentativas;
        this.transferenciaId = transferenciaId;
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

    public LocalDateTime getExecutarEm() {
        return executarEm;
    }

    public String getEstado() {
        return estado;
    }

    public Long getTentativas() {
        return tentativas;
    }

    public Long getTransferenciaId() {
        return transferenciaId;
    }
}