package com.example.coo_eat

class ApiRecipes(addr: String) {
    var addr: String

    init {
        this.addr = addr
    }

    var apiURL = "http://openapi.foodsafetykorea.go.kr/api/cf8505a99bb545f8882c/COOKRCP01/json/1/5"
}