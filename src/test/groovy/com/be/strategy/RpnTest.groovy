package com.be.strategy

import com.be.strategy.not.pattern.Rpn
import spock.lang.Specification

class RpnTest extends Specification {

    def "shouldCalculateRpn"() {
        when:
        def actual = new Rpn().calculate(expression)

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
