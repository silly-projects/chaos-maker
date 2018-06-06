package org.silly.chaos.api

import spock.lang.Specification

class ChaosApiSpec extends Specification {
    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }
}
