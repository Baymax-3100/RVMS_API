package me.masumhasan.rvms_api.domain

class GeoFenceLocationMark {

    String latitude
    String longitude
    GeoFence geoFence

    Date dateCreated
    Date lastUpdated

    static constraints = {
        latitude(nullable: false)
        longitude(nullable: false)
        geoFence(nullable: false)
    }
}
