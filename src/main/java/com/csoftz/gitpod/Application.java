/*----------------------------------------------------------------------------*/
/* Copyright (c), 2020 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Aug.23/2020  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.gitpod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Initial class to bootstrap the application (entry point).
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 14 (JDK)
 */
@SpringBootApplication
public class Application {

    /**
     * Main entry point to the application.
     *
     * @param args Command line arguments to the applications.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
