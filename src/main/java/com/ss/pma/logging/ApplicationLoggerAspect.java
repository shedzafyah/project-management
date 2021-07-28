package com.ss.pma.logging;

import org.aspectj.lang.annotation.*;
import org.slf4j.*;

@Aspect
public class ApplicationLoggerAspect {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
}
