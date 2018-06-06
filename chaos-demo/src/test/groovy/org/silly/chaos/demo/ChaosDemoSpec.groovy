package org.silly.chaos.demo

import spock.lang.Specification

class ChaosDemoSpec extends Specification {
    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }
}
