package me.masumhasan.rvms_api

import me.masumhasan.rvms_api.domain.Vehicle

class BootStrap {

    def init = { servletContext ->
        new Vehicle(vehicleNumber: 29, sourceAddress: "IUBAT", destinationAddress: "Sign Board, Jatrabari").save()
        new Vehicle(vehicleNumber: 19, sourceAddress: "IUBAT", destinationAddress: "Kalshi, mirpur").save()
    }
    def destroy = {
    }
}
