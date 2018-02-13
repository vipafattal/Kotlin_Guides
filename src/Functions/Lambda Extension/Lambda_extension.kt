import General.Examples.Response

data class Response(val statues: Statues, val product: Product){
fun statues(statues: Statues.()-> Unit){}
}

data class Statues(var code:Int,var des:String)
data class Product(var name:String ,var details:String,var price:Double)
fun call(get: String, response: Response.() -> Unit){}
fun main(args:Array<String>){
    call("www.lenovo.com")
    {
        with(statues)
        {
            code = 200
            des = "Succeeded"
        }
        with(product)
        {
            name = "Lenovo"
            details = "Class B"
            price = 650.0
        }
        //or using member extension
        //extension fun can access to all the members of the class that it extended
        statues {
            code = 200
            des = "Succeeded"
        }
    }
}
