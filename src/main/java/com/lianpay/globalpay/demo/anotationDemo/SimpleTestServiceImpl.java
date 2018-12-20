package com.lianpay.globalpay.demo.anotationDemo;

import com.google.inject.Inject;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class SimpleTestServiceImpl implements SimpleTestService {
    private SimpleDependency1 simpleDependency1;
    private SimpleDependency2 simpleDependency2;

    @Inject
    public SimpleTestServiceImpl(SimpleDependency1 simpleDependency1, @TesAnnotation SimpleDependency2 simpleDependency2) {
        this.simpleDependency1 = simpleDependency1;
        this.simpleDependency2 = simpleDependency2;
    }

    public void test() {
        System.out.println("simpleTestService test");
        simpleDependency1.test();
        simpleDependency2.test();
    }
}
