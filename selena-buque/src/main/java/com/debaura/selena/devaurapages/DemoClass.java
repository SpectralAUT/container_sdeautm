package com.debaura.selena.devaurapages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoClass {


    private static final Logger log = LoggerFactory.getLogger(DemoClass.class);


    public static void main(String[] args) {

        System.out.println("print");
        log.debug("debug");
        log.debug("info");
        log.debug("warn");
        log.debug("error");
    }


    private static void add(int a, int b) {
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
        log.info("{} + {} = {}",a,b,result);

    }


}
