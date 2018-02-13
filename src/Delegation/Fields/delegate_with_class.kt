import java.util.*
import kotlin.reflect.KProperty

private typealias connectionState=Boolean
private typealias response=Int

//Delegation 'by' here act as custom get and setters
var state: response by CallState()

class CallState {
    var codeState = 0
    private set
    operator fun getValue(nothing: Nothing?, property: KProperty<*>): Int
    {
        if (codeState == 0){
            println("Connection Error")
            return codeState
        }else return codeState
    }

    operator fun setValue(nothing: Nothing?, property: KProperty<*>, code: Int) {
        codeState=code
    }
}
fun call(URL: String){
    //After General.Examples.Call and connect to the domain
    //Just some random values as example
    val random=Random()
    val ErrorCode=random.nextInt(4)+400 //404 403 402

    val isContentAvailable:connectionState=random.nextBoolean()

    if (!isContentAvailable) state= ErrorCode
    else state=200
}

fun main(args: Array<String>) {
    println("before call")
    println("HTTP status code $state")

    call("www.lenovo.com")

    println("after call")
    println("HTTP status code $state")

}


