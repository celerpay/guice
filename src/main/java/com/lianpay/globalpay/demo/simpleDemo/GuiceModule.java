package com.lianpay.globalpay.demo.simpleDemo;

import com.google.inject.AbstractModule;

/**
 * @author: denghh
 * @Date: 2018/12/19
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SimpleDependicesService2.class).to(DependicesService2.class);
        bind(SimpleDependicesService1.class).to(DependicesService1Impl.class);
        bind(SimpleDemoService.class).to(SimpleDemoServiceImpl.class);
    }
}
