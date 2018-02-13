/**
 * Created by Abed on 1/17/2018.
 */
fun main(arg: Array<String>) {
    //if messageFromServer is null it will take No Data and it print No Data
    val messageFromServer: String? = null
    val cascading: String = messageFromServer ?: "No Data"
    println(cascading)

    //safe scoping
    val response:String?=null/*someValueThatCouldBeNull*/
   response?.let{
       // code will only be executed if *** not null ***
       println("Not Null")
   }
    response.let {
        // code will only be executed if *** null ***
        println("HI I'm Null")
    }
}