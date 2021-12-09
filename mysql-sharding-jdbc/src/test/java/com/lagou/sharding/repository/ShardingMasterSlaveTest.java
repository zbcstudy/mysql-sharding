package com.lagou.sharding.repository;

import com.lagou.sharding.ShardingApplication;
import com.lagou.sharding.entity.City;
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
public class ShardingMasterSlaveTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void masterSalveTest() {
        City city = new City();
        city.setName("hangzhou");
        city.setProvince("hz");
        cityRepository.save(city);
    }

    @Test
    public void selectCityTest() {
        List<City> cities = cityRepository.findAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
