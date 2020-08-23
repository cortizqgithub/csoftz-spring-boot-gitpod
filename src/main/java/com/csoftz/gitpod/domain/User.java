/*----------------------------------------------------------------------------*/
/* Copyright (c), 2020 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Aug.23/2020  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.gitpod.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Domain model for User information.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1
 * @since 14 (JDK)
 */
@AllArgsConstructor
@Data
public class User {
    private String name;
    private String surName;
    private Integer age;
}
