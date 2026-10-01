package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
@Table(name = "movimento",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_movimento_conta_sequencia",
                        columnNames = {"conta_id", "sequencia"}
                )
        }
)
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transferencia_id")
    private Transferencia transferencia;

    @NotNull
    @Positive
    @Column(nullable = false)
    private Long sequencia;

    @NotNull
    @Column(nullable = false, length = 7)
    private String tipo;

    @NotNull
    @Positive
    @Column(name = "valor_centavos", nullable = false)
    private Long valorCentavos;

    @NotNull
    @Column(name = "saldo_apos_centavos", nullable = false)
    private Long saldoAposCentavos;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    public Long getId() {
        return id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public Long getSequencia() {
        return sequencia;
    }

    public void setSequencia(Long sequencia) {
        this.sequencia = sequencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getValorCentavos() {
        return valorCentavos;
    }

    public void setValorCentavos(Long valorCentavos) {
        this.valorCentavos = valorCentavos;
    }

    public Long getSaldoAposCentavos() {
        return saldoAposCentavos;
    }

    public void setSaldoAposCentavos(Long saldoAposCentavos) {
        this.saldoAposCentavos = saldoAposCentavos;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}