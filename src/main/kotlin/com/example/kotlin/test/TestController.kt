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
        return HttpStatus.OK
    }
}