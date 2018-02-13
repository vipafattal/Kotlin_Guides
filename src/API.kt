import java.util.*
import kotlin.properties.Delegates

typealias Product = String
open class API {
    lateinit var objName: Any
    lateinit var name: Product
    lateinit var info: Product
}

interface serverCallBack {
    var responseCode: Int
    fun onResponse(numberOfExecution: Int, execute: () -> API): List<API>
    fun responseCode(): String = when (responseCode) {
        200 -> "Success, OK"
        201 -> "Success, Created"
        202 -> "Success, Accepted"
        203 -> "Success, No Content"
        204 -> "Success, Rest Content"
    ///...
        400 -> "Error, Bad Request"
        401 -> "Error, Unauthorized"
        402 -> "Error, Payment Required"
        403 -> "Error, Forbidden"
        404 -> "Error, Not Found"
    //...
        else -> "Code Not Handled Yet"
    }
}


fun Call(URL: String) {
    //some operation on URL
    val callRead=ReadProductFromServer()
    Response().onResponse(1 /*number of objects to read*/) {
        callRead.startRead()
    }
}

class Response : serverCallBack {
    override var responseCode: Int by Delegates.observable(0) { _, _, _ -> Unit }

    override fun onResponse(numberOfExecution: Int, execute: () -> API): List<API> {

        val jsonRequest = mutableListOf<API>()
        val random = Random()

        val isContentAvailable: Boolean = random.nextBoolean()

        if (isContentAvailable) {

            responseCode = random.nextInt(8) + 200 //200 201 202
            println(responseCode())

            for (i in 0 until numberOfExecution) {
                jsonRequest.add(execute.invoke())
            }
             println(jsonRequest.get(0).objName)

            return jsonRequest
        } else {
            responseCode = random.nextInt(4) + 400 //404 403 402 produce an error
            println(responseCode())
            return emptyList()
        }
    }
}

class ReadProductFromServer {
    var readNum = 0
        private set

    private val api = API()

    fun startRead(): API {
        with(api) {
            objName = "dummyObject" + readNum++
            name = "Lenovo ideapad 310"
            info = "Core i7 class B"
        }
        return api
    }
}
fun main(args:Array<String>){
    Call("www.lenovo.com")
}