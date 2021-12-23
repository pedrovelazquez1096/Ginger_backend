package com.pvelazquez.gingerIoT.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ActuadoresRegistro")
public class ActuadorRegistro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long idActuador;
    @Column(nullable = false)
    private int valor;
    @Column(nullable = false)
    private String timeStamp;
    @Column(nullable = false)
    private boolean aplicado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdActuador() {
        return idActuador;
    }

    public void setIdActuador(Long idActuador) {
        this.idActuador = idActuador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isAplicado() {
        return aplicado;
    }

    public void setAplicado(boolean aplicado) {
        this.aplicado = aplicado;
    }
}
