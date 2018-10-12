package me.masumhasan.rvms_api.controller


import grails.rest.*
import grails.converters.*
import me.masumhasan.rvms_api.domain.User

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }
}
