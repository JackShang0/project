package com.project.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @description: 将list中的数据，按照list中的数据的某个类型进行分组
 * @author: shangqj
 * @date: 2024/7/10
 * @version: 1.0
 */
public class ListToMapByType {


    public void listToMap() {
        List<Bean_FloodArbor> beanFloodArbors = new ArrayList<>();
        /*
         * 将我们需要处理的list，按照list中数据的某个字段进行分组
         */
        Map<String, List<Bean_FloodArbor>> stringListMap = ListUtils.groupBy(beanFloodArbors, arbor ->
                //Optional.ofNullable(arbor.getHostAddress()).toString().substring(0, arbor.getHostAddress().lastIndexOf(".")));
                arbor.getHostAddress().substring(0, arbor.getHostAddress().lastIndexOf(".")));

        //使用 Stream流进行list的分组处理
        /*Map<String, List<HashMap>> uniqueId = beanFloodArbors.stream()
                .collect(Collectors.groupingBy(map -> (String) map.get("uniqueId")));*/

        /*Map<String, List<HashMap>> uniqueId2 = beanFloodArbors.stream()
                .collect(Collectors.groupingBy(new Function<Object, Object>() {
                    @Override
                    public Object apply(Object o) {
                        return ;
                    }
                }));*/
    }
}
