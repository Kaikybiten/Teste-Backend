package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
@Table(name = "idempotencia")
public class Idempotencia {

    @Id
    @Column(length = 255)
    private String chave;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String endpoint;

    @NotBlank
    @Column(name = "hash_requisicao", nullable = false)
    private String hashRequisicao;

    @NotBlank
    @Column(name = "resposta_json", nullable = false, columnDefinition = "jsonb")
    private String respostaJson;

    @Column(name = "status_http", nullable = false)
    private Integer statusHttp;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getHashRequisicao() {
        return hashRequisicao;
    }

    public void setHashRequisicao(String hashRequisicao) {
        this.hashRequisicao = hashRequisicao;
    }

    public String getRespostaJson() {
        return respostaJson;
    }

    public void setRespostaJson(String respostaJson) {
        this.respostaJson = respostaJson;
    }

    public Integer getStatusHttp() {
        return statusHttp;
    }

    public void setStatusHttp(Integer statusHttp) {
        this.statusHttp = statusHttp;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}