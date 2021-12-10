package com.pvelazquez.gingerIoT.model;

import javax.persistence.*;

@Entity
@Table(name = "Actuadores")
public class Actuador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    @Column
    private String descripcion;
    @Column(nullable = false)
    private String tipoActuador;
    @Column
    private String ubicacion;
    @Column(nullable = false)
    private String unidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoActuador() {
        return tipoActuador;
    }

    public void setTipoActuador(String tipoActuador) {
        this.tipoActuador = tipoActuador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }
}
