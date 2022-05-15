package les3

fun main(){
    println(agoToText(120322))
}

fun agoToText(second:Int):String{
    var result = ""
    var minute = second / 60
    var hours = minute / 60
    when(second){
        in 0..60 -> result ="только что"
        in 61..3600 -> result ="$minute минут назад"
        in 3601..86400 -> result ="$hours часов назад"
        in 86400..172800 -> result = "сегодня"
        in 172801..259200 -> result = "вчера"
        else -> "давно"

    }

    return result
}