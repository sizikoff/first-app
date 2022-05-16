package les2

import java.util.*

fun main(){
    println("Введите сумму перевода")
    val scanner = Scanner(System.`in`)
    val count = scanner.nextLine().trim().toInt()
    val amount = count * 100 //копейки
    var com = amount * 0.0075
    if(com <= 3500.0){
        println("Комиссия составила " + 3500 + " копеек")
    }else{
        println("Комиссия составила $com копеек")
    }
}