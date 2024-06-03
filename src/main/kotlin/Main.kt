package ru.netology

val likes : Int = 567

fun main() {
   val people = if(likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $people.")
}