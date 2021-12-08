package com.lagou.sharding.repository;

import com.lagou.sharding.ShardingApplication;
import com.lagou.sharding.entity.User;
import com.lagou.sharding.entity.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author aaron
 * @since 2021/12/7
 */
@SpringBootTest(classes = {ShardingApplication.class})
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Test
    public void testSave() {
        for (int i = 2; i < 100; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setAge(11 + i);
            userRepository.save(user);
        }
    }

    @Test
    public void testSave2() {
        for (int i = 2; i < 100; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setAge(11 + i);
            userRepository.save(user);

            UserDetail userDetail = new UserDetail();
            userDetail.setuId(user.getId());
            userDetail.setDetail("detail-" + i);
            userDetailRepository.save(userDetail);
        }
    }
}