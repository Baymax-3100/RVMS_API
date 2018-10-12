package me.masumhasan.rvms_api.domain

class Vehicle {

    Integer vehicleNumber
    String sourceAddress
    String destinationAddress
    String sourceLatitude
    String sourceLongitude
    String destinationLatitude
    String destinationLongitude
    User user

    Date dateCreated
    Date lastUpdated

    static constraints = {
        sourceLatitude(nullable: true)
        sourceLongitude(nullable: true)
        destinationLatitude(nullable: true)
        destinationLongitude(nullable: true)
        user(nullable: true)
    }
}
