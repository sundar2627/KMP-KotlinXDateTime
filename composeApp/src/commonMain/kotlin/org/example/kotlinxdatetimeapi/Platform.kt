package org.example.kotlinxdatetimeapi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform