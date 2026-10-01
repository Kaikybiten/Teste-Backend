package com.example.demo.dto.conta;

public class ContaResponseDTO {

    private Long id;
    private String numero;
    private Long usuarioId;
    private Long saldoCentavos;
    private Long limiteDiarioCentavos;
    private String estado;

    public ContaResponseDTO(
            Long id,
            String numero,
            Long usuarioId,
            Long saldoCentavos,
            Long limiteDiarioCentavos,
            String estado
    ) {
        this.id = id;
        this.numero = numero;
        this.usuarioId = usuarioId;
        this.saldoCentavos = saldoCentavos;
        this.limiteDiarioCentavos = limiteDiarioCentavos;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public Long getSaldoCentavos() {
        return saldoCentavos;
    }

    public Long getLimiteDiarioCentavos() {
        return limiteDiarioCentavos;
    }

    public String getEstado() {
        return estado;
    }
}