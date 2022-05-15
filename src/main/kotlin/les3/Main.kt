package les3

fun main(){
    println(agoToText(120322))
}

fun agoToText(second:Int):String{
    var result = ""
    var minuteText =""
    var hoursText =""
    var minute = second / 60
    var hours = minute / 60

    when(minute){
        1,21,31,41,51 -> minuteText="минуту"
        2,3,4,22,23,24,32,33,44,52,53,54 -> minuteText="минуты"
        else -> minuteText="минут"
    }

    when(hours){
        1,21 -> hoursText="час"
        2,3,4,22,23 -> hoursText="часа"
        else -> hoursText="часов"
    }

    when(second){
        in 0..60 -> result ="только что"
        in 61..3600 -> result ="$minute $minuteText назад"
        in 3601..86400 -> result ="$hours $hoursText назад"
        in 86400..172800 -> result = "сегодня"
        in 172801..259200 -> result = "вчера"
        else -> "давно"

    }

    return result
}