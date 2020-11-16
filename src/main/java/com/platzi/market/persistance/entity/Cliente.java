package com.platzi.market.persistance.entity;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @Column(name = "id")
    private String cedula;

    @Nullable
    private String nombre;

    @Nullable
    private String apellidos;

    @Nullable
    private Integer celularl;

    @Nullable
    private String direccion;

    @Nullable
    @Column(name = "correo_electronico")
    private String correoElectronico;
}
