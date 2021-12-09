package com.lagou.sharding.repository;

import com.lagou.sharding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author aaron
 * @since 2021/12/7
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true,value = "select u.id,u.name,u.age,ud.detail from user u join user_detail ud on u.id=ud" +
            ".u_id where u.id=:id")
    Object findUserById(@Param("id") Long id);
}
