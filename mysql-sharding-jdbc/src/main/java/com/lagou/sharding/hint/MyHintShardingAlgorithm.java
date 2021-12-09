package com.lagou.sharding.hint;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 自定义hint分片操作
 *
 * @author aaron
 * @since 2021/12/9
 */
public class MyHintShardingAlgorithm implements HintShardingAlgorithm<Long> {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<Long> shardingValue) {

        Collection<String> result = new ArrayList<>();
        for (String availableTargetName : availableTargetNames) {
            Collection<Long> hintValues = shardingValue.getValues();
            for (Long hintValue : hintValues) {
                if (availableTargetName.endsWith(String.valueOf(hintValue % 2))) {
                    result.add(availableTargetName);
                }
            }
        }
        return result;
    }
}
