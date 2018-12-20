package com.lianpay.globalpay.demo.providerDemo;

import com.google.inject.Inject;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class Provider implements com.google.inject.Provider<SimpleTestService> {
    private SimpleDependencyService simpleDependencyService;

    @Inject
    public Provider(SimpleDependencyService simpleDependencyService) {
        this.simpleDependencyService = simpleDependencyService;
    }

    public SimpleTestService get() {
        SimpleTestServiceImpl simpleTestService = new SimpleTestServiceImpl();
        simpleTestService.setSimpleDependencyService(simpleDependencyService);
        return simpleTestService;
    }
}
