package com.example.backenddeneme2.Repository;

import com.example.backenddeneme2.entity.ProductInCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductInCartRepository extends JpaRepository<ProductInCart, Long> {

    @Query(value = "select p.product_id from product_in_cart p where p.cart_id=?1",
    nativeQuery = true)
    List<Long> getProductInCartByCartId(Long cartId);

}
