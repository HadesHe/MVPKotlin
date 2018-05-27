package com.example.zhanghehe.mvpkotlin.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.example.zhanghehe.mvpkotlin.model.Product

@Entity(tableName = "products")
class ProductEntity :Product{


    private var name: String

    @PrimaryKey private var id: Int

    private  var description: String

    private var price: Int

    constructor(id:Int, name:String, description:String, price:Int){
        this.id=id
        this.name=name
        this.description=description
        this.price=price
    }

    constructor(product: Product){
        this.id=product.getId()
        this.name=product.getName()
        this.description=product.getDescription()
        this.price=product.getPrice()
    }
    override fun getId(): Int {
        return id
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getPrice(): Int {
        return price
    }

}