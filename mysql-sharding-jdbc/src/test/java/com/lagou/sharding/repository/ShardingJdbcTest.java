package com.lagou.sharding.repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lagou.sharding.ShardingApplication;
import com.lagou.sharding.entity.City;
import com.lagou.sharding.entity.User;
import com.lagou.sharding.entity.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author aaron
 * @since 2021/12/7
 */
@SpringBootTest(classes = {ShardingApplication.class})
@RunWith(SpringRunner.class)
public class ShardingJdbcTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Autowired
    private CityRepository cityRepository;

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

    @Test
    public void findById() {
        Object object = userRepository.findUserById(675405749450440704l);
        String json = JSONObject.toJSONString(object);
        List<Object> list = JSONArray.parseArray(json, Object.class);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    /**
     * 测试广播表 每个库中都会存一份相同的数据
     */
    @Test
    public void testBroadcast() {
        City city = new City();
        city.setName("shanghai");
        city.setProvince("shanghai");
        cityRepository.save(city);
        System.out.println(city.getId());
    }
}