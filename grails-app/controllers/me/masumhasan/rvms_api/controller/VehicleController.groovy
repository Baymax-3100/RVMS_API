package me.masumhasan.rvms_api.controller


import grails.rest.*
import grails.converters.*
import me.masumhasan.rvms_api.domain.Vehicle

class VehicleController extends RestfulController {
    static responseFormats = ['json']

    VehicleController() {
        super(Vehicle)
    }
}
