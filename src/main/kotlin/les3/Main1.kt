package les3

fun main(){
println(commission("Maestro",1000,26000))
}

fun commission(type:String ="VkPay",sumCurrentTrans:Int,sum:Int = 0):Double{
    var com = 0.0
    when(type){
        "VkPay" -> com = 0.0
        "MasterCard","Maestro" -> when(sum){
            in 0..75000 -> com = 0.0
            else -> com = (sumCurrentTrans * 0.6 + 20) * 100
        }
        "Visa","Mir"-> if (sumCurrentTrans * 0.75 < 35) {
            com = 3500.0
        }
        else {
            com = sumCurrentTrans * 0.75 * 100
        }
    }

    return com
}