package io.binghe.rpc.test.scanner;


import io.binghe.rpc.common.scanner.ClassScanner;
import io.binghe.rpc.common.scanner.reference.RpcReferenceScanner;
import io.binghe.rpc.common.scanner.server.RpcServiceScanner;
import org.junit.Test;

import java.util.List;

public class ScannerTest {

    @Test
    public void testScannerClassNameList() throws Exception {
        List<String> classNameList = ClassScanner.getClassNameList("io.binghe.rpc.test.scanner");
        classNameList.forEach(System.out::println);
        System.out.println("nihao");
        System.out.println("nihao");
        System.out.println("nihao");
    }

    @Test
    public void testScannerClassNameListByRpcService() throws Exception {
        RpcServiceScanner.
                doScannerWithRpcServiceAnnotationFilterAndRegistryService("io.binghe.rpc.test.scanner");
    }

    @Test
    public void testScannerClassNameListByRpcReference() throws Exception {
        RpcReferenceScanner.
                doScannerWithRpcReferenceAnnotationFilter("io.binghe.rpc.test.scanner");
    }
}
