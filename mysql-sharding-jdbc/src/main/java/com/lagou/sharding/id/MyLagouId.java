package com.lagou.sharding.id;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * 自定义主键生成器
 *
 * @author aaron
 * @since 2021/12/8
 */
public class MyLagouId implements ShardingKeyGenerator {

    SnowflakeShardingKeyGenerator shardingKeyGenerator = new SnowflakeShardingKeyGenerator();

    @Override
    public Comparable<?> generateKey() {
        System.out.println("自定义主键生成器");
        return shardingKeyGenerator.generateKey();
    }

    @Override
    public String getType() {
        return "LAGOU";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
