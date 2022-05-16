package com.example.kotlin.test

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Integer.sum


@RestController
class TestController {

    @GetMapping("/test")
    fun testCon(): HttpStatus {
        //test 1
        //test 2
        print("1new")
        print("2new")
        print("4new")
        print("6new")
        print("2new")
        print("3new")
        print("4new")
        print("5new")
        print("6new")
        return HttpStatus.OK
    }
}