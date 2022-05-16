package com.example.kotlin.test

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Integer.sum


@RestController
class TestController {

    @GetMapping("/test")
    fun testCon(): HttpStatus {
        print("1commint")
        print("2commint")
        print("3commint")
        print("4commint")
        print("5commint")
        print("6commint")
        print("7commint")
        print("8commint")
        print("9commint")
        print("10commint")
        print("11commint")
        print("12commint")
        print("13commint")
        print("14commint")
        print("15commint")
        print("16commint")
        print("17commint")
        return HttpStatus.OK
    }
}