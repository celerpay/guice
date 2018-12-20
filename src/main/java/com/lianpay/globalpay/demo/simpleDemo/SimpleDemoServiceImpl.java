package com.lianpay.globalpay.demo.simpleDemo;

import com.google.inject.Inject;

/**
 * @author: denghh
 * @Date: 2018/12/19
 */
public class SimpleDemoServiceImpl implements SimpleDemoService {
    private SimpleDependicesService1 simpleDependicesService1;
    private SimpleDependicesService2 simpleDependicesService2;

    @Inject
    public SimpleDemoServiceImpl(SimpleDependicesService1 simpleDependicesService1, SimpleDependicesService2 simpleDependicesService2) {
        this.simpleDependicesService2 = simpleDependicesService2;
        this.simpleDependicesService1 = simpleDependicesService1;
    }

    @Override
    public void doSomething() {
        System.out.println("something doing");
        simpleDependicesService1.testService();
        simpleDependicesService2.test2();
    }
}
