package com.lianpay.globalpay.demo.providerDemo;

import com.google.inject.AbstractModule;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class GuiceModule extends AbstractModule {
    protected void configure() {
        bind(SimpleTestService.class).toProvider(Provider.class);
        bind(SimpleDependencyService.class).to(SimpleDependencyServiceImpl.class);
    }
}
