package me.masumhasan.rvms_api.domain

class GeoFence {

    String fenceName
    Vehicle vehicle

    Date dateCreated
    Date lastUpdated

    static hasMany = [geoFenceLocationMark: GeoFenceLocationMark]

    static constraints = {
        fenceName(nullable: false)
        vehicle(nullable: false)
    }
}
