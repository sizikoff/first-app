package les3

fun main(){
    println(agoToText(2000))
}

fun agoToText(second:Int):String{
    when(second){
        in 0..60 -> return "только что"
        in 61..3600 -> return minutes(second)
        in 3601..86400 -> return hours(second)
        in 86400..172800 -> return "сегодня"
        in 172801..259200 -> return "вчера"
        else -> return "давно"
    }
}
fun minutes(second: Int):String{
    var minute = second / 60
    when(minute % 10){
        1 -> return "$minute минуту назад"
        2,3,4 -> return "$minute минуты назад"
        else -> return "$minute минут назад"
    }
}
fun hours(seconds:Int):String{
    var hours = seconds / 3600
    when(hours % 10){
        1 -> return "$hours час назад"
        2,3,4 -> return "$hours часа назад"
        else -> return "$hours часов назад"
    }
}