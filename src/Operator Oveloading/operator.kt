
fun main(arg:Array<String>) {
val newTime = Time(10,40) + Time(3,20)
    println(newTime)
}

data class Time(val mins:Int,val hours:Int)
{
operator fun plus(time: Time):Time{
    val minutes = this.mins + time.mins
    val hours = this.hours + time.hours
    return Time(minutes,hours)
}
}
