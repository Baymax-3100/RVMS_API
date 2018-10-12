package me.masumhasan.rvms_api.controller

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class SystemInterceptorSpec extends Specification implements InterceptorUnitTest<SystemInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test system interceptor matching"() {
        when: "A request matches the interceptor"
        withRequest(controller: "system")

        then: "The interceptor does match"
        interceptor.doesMatch()
    }
}
