package com.pvelazquez.gingerIoT.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "SensoresRegistro")
public class SensorRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    @Column(nullable = false)
    private Long idSensor;
    @Column(nullable = false)
    private float valor;
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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isAplicado() {
        return aplicado;
    }

    public void setAplicado(boolean aplicado) {
        this.aplicado = aplicado;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

}
