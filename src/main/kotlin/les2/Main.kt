package les2

import java.util.*

fun main(){
    println("Введите сумму перевода")
    val scanner = Scanner(System.`in`)
    val count = scanner.nextLine().trim().toInt()
    val amount = count * 100 //копейки
    println("Комиссия составила " +amount * 0.75f + " копеек")
}