package com.lianpay.globalpay.demo.providerDemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class BootStrapProvider {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        SimpleTestService s = injector.getInstance(SimpleTestService.class);
        s.test();
    }
}
