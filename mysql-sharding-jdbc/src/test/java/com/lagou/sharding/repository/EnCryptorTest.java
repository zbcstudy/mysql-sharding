package com.lagou.sharding.repository;

import com.lagou.sharding.ShardingApplication;
import com.lagou.sharding.entity.Crypt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author aaron
 * @since 2021/12/9
 */
@SpringBootTest(classes = {ShardingApplication.class})
@RunWith(SpringRunner.class)
public class EnCryptorTest {

    @Autowired
    private CryptRepository cryptRepository;

    @Test
    public void saveTest() {
        Crypt crypt = new Crypt();
        crypt.setName("zbc");
        crypt.setPwd("123");
        cryptRepository.save(crypt);
    }

}
