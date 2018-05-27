package com.example.zhanghehe.mvpkotlin.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import com.example.zhanghehe.mvpkotlin.model.Comment
import java.util.*

@Entity(
        tableName = "comments"
)
class CommentEntity :Comment{
    override fun getId(): Integer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProductId(): Integer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getText(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPostedAt(): Date {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}