package com.ss.pma.logging;

import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ApplicationLoggerAspect {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Pointcut("within(com.ss.pma.controller..*)")
    public void definePackagePointcuts(){

    }
    @After("definePackagePointcuts()")
    public void log(){
        log.debug("---------------------------------------");
    }
}
