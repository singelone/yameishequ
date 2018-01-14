package com.app.ymsq.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

/**
 * 实现kryo序列化
 * @author Administrator
 *
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //classes.add(BidRequest.class);
        return classes;
    }
}
