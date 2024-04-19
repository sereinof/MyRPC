package io.binghe.rpc.test.scanner.consumer.service.impl;

import io.binghe.rpc.annotation.RpcReference;
import io.binghe.rpc.test.scanner.consumer.service.ConsumerBusinessService;
import io.binghe.rpc.test.scanner.service.DemoService;

public class ConsumerBusinessServiceImpl implements ConsumerBusinessService {
    @RpcReference(registryType = "zookeeper",
            registryAddress = "127.0.0.1:2181",
            version = "1.0.0", group = "binghe")
    private DemoService demoService;

}
