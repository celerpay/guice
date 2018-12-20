package com.lianpay.globalpay.demo.providsDemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class BootStrap {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        SimpleTestService simpleTestService = injector.getInstance(SimpleTestService.class);
        simpleTestService.test();
    }
}
