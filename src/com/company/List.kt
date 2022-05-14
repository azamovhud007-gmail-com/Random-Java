package com.company

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var list=ArrayList<User>()
    var scanner=Scanner(System.`in`)
    while (true){
        println("1-> Add User ")
        println("2-> Edit User ")
        println("3-> Delete User ")
        println("4-> Edit User ")
        println("5- User List ")
        println("Choose :")
        var c=scanner.nextInt()
        when(c){
            1->{
                println("User name :")
                var username=scanner.next()
                println("user email :")
                var userEmail=scanner.next()
                println("user password :")
                var userPassword=scanner.next()
                var user=User()
                user.email=userEmail
                user.password=userPassword
                user.name=username
                list.add(user)
                println("Success !")
            }
            2->{
                for (i in  0 until list.size) {
                    println("========${i+1}==========")
                    println("User name : ${list[i].name}")
                    println("User password : ${list[i].password}")
                    println("User email : ${list[i].email}")
                }
                println("Choose :")
                var cs=scanner.nextInt()
                println("edit User name :")
                var userName=scanner.next()
                println("edit user email :")
                var email=scanner.next()
                println()
            }
        5->{
            for (user in list.indices) {
                println("======================${user+1}=============")
                println("Name ${list[user].name}")
                println("Password: ${list[user].password}")
                println("Email ${list[user].email}")
                println("================================")
            }
        }
        }
    }
}