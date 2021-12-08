package com.lagou.sharding.repository;

import com.lagou.sharding.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aaron
 * @since 2021/12/8
 */
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {
}
