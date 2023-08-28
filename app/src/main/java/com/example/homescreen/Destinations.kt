package com.example.homescreen

interface Destinations{
    val route:String
}
object LoginScreen:Destinations{
    override val route="LoginScreen"
}
object TopAppBar:Destinations{
    override val route="TopAppBar"
}