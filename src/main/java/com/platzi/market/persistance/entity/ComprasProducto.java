package com.platzi.market.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", updatable = false, insertable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", updatable = false, insertable = false)
    private Producto producto;

}
