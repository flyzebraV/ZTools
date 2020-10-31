package com.vincent.jetpacktest.utils

/**
 * 描述：
 */
class MyStringUtils {
    companion object {
        @JvmStatic
        fun capitalize(str: String): String {
            return "toLowerCase=" + str.toLowerCase()
        }
    }
}