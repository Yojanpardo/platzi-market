package com.platzi.market.persistance.crud;


import com.platzi.market.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // se puede hacer un query de forma nativa @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    // pero lo mejor son los query methods por su flexibilidad
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
