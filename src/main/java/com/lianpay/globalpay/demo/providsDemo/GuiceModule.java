package com.lianpay.globalpay.demo.providsDemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SimpleTestService.class).to(SimpleTestServiceImpl.class);
    }

    @Provides
    SimpleDependencyService providerSimpleDependencyService() {
        return new SimpleDependencyServiceImpl();
    }

}
