package me.masumhasan.rvms_api.controller


import grails.rest.*
import grails.converters.*
import me.masumhasan.rvms_api.RSAAuthentication
import me.masumhasan.rvms_api.domain.Vehicle

import java.security.KeyPair

class VehicleController extends RestfulController {
    static responseFormats = ['json']

    @Override
    def index(Integer max) {
        KeyPair keyPair = RSAAuthentication.keyPairFromKeyStore
        println(keyPair.public.toString())
        params.max = Math.min(max ?: 10, 100)
        respond listAllResources(params), model: [("${resourceName}Count".toString()): countResources()]
    }

    VehicleController() {
        super(Vehicle)
    }
}
