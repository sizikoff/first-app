package les2

import java.util.*

fun main(){
    println("Введите сумму перевода")
    val scanner = Scanner(System.`in`)
    val count = scanner.nextLine().trim().toInt()
    val amount = count * 100//копейки
    var com:Double
    if((amount * 0.0075) <= 3500){
        com = 3500.0
    }else{
        com = amount * 0.0075
    }
    println("Комиссия составила $com копеек")
}