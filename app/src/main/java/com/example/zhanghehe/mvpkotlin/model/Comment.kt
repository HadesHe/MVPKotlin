package com.example.zhanghehe.mvpkotlin.model

import java.util.*

interface Comment {
    fun getId():Integer
    fun getProductId():Integer
    fun getText():String
    fun getPostedAt():Date
}