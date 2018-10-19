package me.masumhasan.rvms_api.controller


import grails.rest.*
import me.masumhasan.rvms_api.domain.CurrentLocation

class VehicleLocationController extends RestfulController {
    static responseFormats = ['json', 'xml']

    VehicleLocationController() {
        super(CurrentLocation)
    }
}