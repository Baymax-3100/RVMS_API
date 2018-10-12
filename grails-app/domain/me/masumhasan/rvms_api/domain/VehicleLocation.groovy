package me.masumhasan.rvms_api.domain

class VehicleLocation {

    Long latitude
    Long longitude
    Vehicle vehicle

    Date dateCreated
    Date lastUpdated

    static hasMany = [locationHistory: LocationHistory]

    static constraints = {
        vehicle(nullable: true)
    }
}
