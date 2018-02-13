

class  Singleton{
   private constructor(){
 println("Hello World!!!")
    }
    companion object {
        val instance:Singleton by lazy{Singleton()}
    }
    fun <T> myFun(Table:T){
        println(Table)
    }
}

fun main(agrs: Array<String>){


   var s1 = Singleton.instance

    s1.myFun("CodeBox")

}
