import General.Examples.Response

//sealed it make the ability to make inheritance from the class from out
//of File that super class not possible so it's just like private (Super Class)inheritance class
sealed class Response
class Success(val content:String) : Response()
class Error(val code:Int,val message:String): Response()
fun getPageContent(url: String): Response {
    // after some operations......
    val isConnectionDone = false
    if (isConnectionDone){
        return Success("The Content")
    }
    else
        return Error(404,"Forbidden")
}


fun main(args: Array<String>) {

val connectionResult =getPageContent("www.lenovo.com")
    when(connectionResult){
        is Success -> println(connectionResult.content)
        is Error -> println("${connectionResult.code}, ${connectionResult.message}")
    }
}


