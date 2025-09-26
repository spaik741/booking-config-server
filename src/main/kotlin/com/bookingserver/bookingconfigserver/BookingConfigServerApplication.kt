package com.bookingserver.bookingconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class BookingConfigServerApplication

fun main(args: Array<String>) {
	runApplication<BookingConfigServerApplication>(*args)
}
