package me.masumhasan.rvms_api

import me.masumhasan.rvms_api.domain.CurrentLocation
import me.masumhasan.rvms_api.domain.Vehicle

class BootStrap {

    def init = { servletContext ->
        Vehicle v29 = new Vehicle(vehicleNumber: 29, sourceAddress: "IUBAT", destinationAddress: "Sign Board, Jatrabari", currentLocation: new CurrentLocation(longitude: "28.00156345", latitude: "-27.26846589")).save()
        Vehicle v19 = new Vehicle(vehicleNumber: 19, sourceAddress: "IUBAT", destinationAddress: "Kalshi, mirpur", currentLocation: new CurrentLocation(longitude: "28.00156345", latitude: "-27.26846589")).save()
    }
    def destroy = {
    }
}
