package decorator.burgerRestaurant

import decorator.burgerRestaurant.burgers.Burger
import decorator.burgerRestaurant.burgers.SuperBurger
import decorator.burgerRestaurant.burgers.ZingerBurger

fun main(){
    val zinger = ZingerBurger.Builder().apply {
        addCheese()
    }.build()
    val superBurger = SuperBurger.Builder().apply {
        addMayonnaise()
        addCheese()
    }.build()
    println("${zinger.description} : ${zinger.price()}")
    println("${superBurger.description} : ${superBurger.price()}")
}