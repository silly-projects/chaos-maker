package org.silly.chaos.core

import spock.lang.Specification

class ChaosCoreSpec extends Specification {
    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }
}
