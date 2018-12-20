package com.lianpay.globalpay.demo.providerDemo;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class SimpleTestServiceImpl implements SimpleTestService {
    private SimpleDependencyService simpleDependencyService;

    public SimpleDependencyService getSimpleDependencyService() {
        return simpleDependencyService;
    }

    public void setSimpleDependencyService(SimpleDependencyService simpleDependencyService) {
        this.simpleDependencyService = simpleDependencyService;
    }

    public void test() {
        System.out.println("simpleTestServiceImpl test");
        simpleDependencyService.test();
    }
}
