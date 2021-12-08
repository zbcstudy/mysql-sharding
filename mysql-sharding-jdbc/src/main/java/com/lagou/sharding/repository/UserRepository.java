package com.lagou.sharding.repository;

import com.lagou.sharding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aaron
 * @since 2021/12/7
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
