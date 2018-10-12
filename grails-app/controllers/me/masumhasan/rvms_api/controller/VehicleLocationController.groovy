package me.masumhasan.rvms_api.controller


import grails.rest.*
import grails.converters.*
import me.masumhasan.rvms_api.domain.VehicleLocation

class VehicleLocationController extends RestfulController {
    static responseFormats = ['json', 'xml']

    VehicleLocationController() {
        super(VehicleLocation)
    }
}
