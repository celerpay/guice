package com.lianpay.globalpay.demo.providsDemo;

import com.google.inject.Inject;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class SimpleTestServiceImpl implements SimpleTestService {
    private SimpleDependencyService simpleDependencyService;

    @Inject
    public SimpleTestServiceImpl(SimpleDependencyService simpleDependencyService) {
        this.simpleDependencyService = simpleDependencyService;
    }

    public void test() {
        System.out.println("SimpleTestServiceImpl test");
        simpleDependencyService.test();
    }
}
