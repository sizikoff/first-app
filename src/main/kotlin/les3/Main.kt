package les3

fun main(){
    println(agoToText(2000))
}

fun agoToText(second:Int):String{
    var result = ""

    fun minutes(second: Int):String{
        var minuteText =""
        var minute = second / 60
        when(minute){
            1,21,31,41,51 -> minuteText="$minute минуту назад"
            2,3,4,22,23,24,32,33,44,52,53,54 -> minuteText="$minute минуты назад"
            else -> minuteText="$minute минут назад"
        }
        return minuteText
    }

    fun hours(seconds:Int):String{
        var hours = seconds / 3600
        var hoursText = ""
        when(hours){
            1,21 -> hoursText="$hours час назад"
            2,3,4,22,23 -> hoursText = "$hours часа назад"
            else -> hoursText="$hours часов назад"
        }
        return hoursText
    }

    when(second){
        in 0..60 -> result ="только что"
        in 61..3600 -> result = minutes(second)
        in 3601..86400 -> result = hours(second)
        in 86400..172800 -> result = "сегодня"
        in 172801..259200 -> result = "вчера"
        else -> "давно"
    }

    return result
}