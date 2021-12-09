package com.lagou.sharding.repository;

import com.lagou.sharding.entity.Crypt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aaron
 * @since 2021/12/9
 */
@Repository
public interface CryptRepository extends JpaRepository<Crypt, Long> {
}
