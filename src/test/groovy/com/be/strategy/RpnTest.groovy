package com.be.strategy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = SpringConfiguration.class)
class RpnTest extends Specification {

    @Autowired
    private Rpn rpn

    def "should calculate rpn"() {
        when:
        def actual = rpn.calculate(expression)

        then:
        actual == result

        where:
        expression                       | result
        "2 3 +"                          | "5"
        "4 5 -"                          | "-1"
        "6 3 *"                          | "18"
        "12 2 /"                         | "6"
        "15 7 1 1 + - / 3 * 2 1 1 + + -" | "5"
    }
}
