package com.lianpay.globalpay.demo.anotationDemo;

import com.google.inject.AbstractModule;

/**
 * @author: denghh
 * @Date: 2018/12/20
 */
public class GuiceModule extends AbstractModule {
    protected void configure() {
        bind(SimpleDependency2.class).annotatedWith(TesAnnotation.class).to(SimpleDependency2Impl.class);
        bind(SimpleDependency1.class).to(SimpleDependency1Impl.class);
        bind(SimpleTestService.class).to(SimpleTestServiceImpl.class);
    }
}
