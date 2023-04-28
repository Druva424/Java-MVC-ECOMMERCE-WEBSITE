package com.OOAD.ecommerce.dao;

import com.OOAD.ecommerce.entity.Cart;
import com.OOAD.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}
