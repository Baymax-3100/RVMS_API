package me.masumhasan.rvms_api.controller


import grails.rest.*
import grails.converters.*
import me.masumhasan.rvms_api.domain.GeoFence

class GeoFenceController extends RestfulController {
    static responseFormats = ['json', 'xml']

    GeoFenceController() {
        super(GeoFence)
    }
}
