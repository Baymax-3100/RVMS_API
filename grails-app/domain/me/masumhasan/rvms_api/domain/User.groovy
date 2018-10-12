package me.masumhasan.rvms_api.domain

class User {

    String userName
    String userId
    String password
    String emailAdd

    String accessLevel

    Date dateCreated
    Date lastUpdated

    static hasMany = [vehicle: Vehicle]

    static constraints = {
    }

    def beforeInsert() {
        this.password = this.password.concat("it's a salt").encodeAsSHA256()
    }

    def beforeUpdate() {
        this.password = this.password.concat("it's a salt").encodeAsSHA256()
    }
}
