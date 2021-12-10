package com.pvelazquez.gingerIoT.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "LucesRegistro")
public class LuzRegistro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long idLuz;
    @Column(nullable = false)
    private int valor;
    @Column(nullable = false)
    private Timestamp timeStamp;
    @Column(nullable = false)
    private boolean aplicado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLuz() {
        return idLuz;
    }

    public void setIdLuz(Long idLuz) {
        this.idLuz = idLuz;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isAplicado() {
        return aplicado;
    }

    public void setAplicado(boolean aplicado) {
        this.aplicado = aplicado;
    }
}
