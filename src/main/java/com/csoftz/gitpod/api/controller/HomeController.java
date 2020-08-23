/*----------------------------------------------------------------------------*/
/* Copyright (c), 2020 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Aug.23/2020  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.gitpod.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.gitpod.domain.User;

/**
 * REST API to the Home resources.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 14 (JDK)
 */
@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping
    public String index() {
        return "Joshua ";
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("Carlos", "Ortiz", 52);
    }
}
