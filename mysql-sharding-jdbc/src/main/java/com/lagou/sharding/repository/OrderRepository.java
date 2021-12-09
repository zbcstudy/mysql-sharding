package com.lagou.sharding.repository;

import com.lagou.sharding.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aaron
 * @since 2021/12/9
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
