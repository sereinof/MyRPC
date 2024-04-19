package io.binghe.rpc.test.scanner.provider;

import io.binghe.rpc.annotation.RpcService;
import io.binghe.rpc.test.scanner.service.DemoService;

@RpcService(interfaceClass = DemoService.class,
        interfaceClassName = "io.binghe.rpc.test.scanner.service.DemoService",
        version = "1.0.0", group = "binghe")
public class ProviderDemoServiceImpl implements DemoService {
}
