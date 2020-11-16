package com.platzi.market.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_cliente", updatable = false, insertable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> comprasProductos;
}
