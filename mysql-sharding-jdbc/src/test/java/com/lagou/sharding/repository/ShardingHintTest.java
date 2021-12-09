package com.lagou.sharding.repository;

import com.lagou.sharding.ShardingApplication;
import com.lagou.sharding.entity.City;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author aaron
 * @since 2021/12/9
 */
@SpringBootTest(classes = {ShardingApplication.class})
@RunWith(SpringRunner.class)
public class ShardingHintTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void hintTest() {
        // 强制路由到主库
        HintManager hintManager = HintManager.getInstance();
        hintManager.setDatabaseShardingValue(0l);
        List<City> cities = cityRepository.findAll();
        cities.forEach(System.out::println);
        hintManager.close();
    }
}
