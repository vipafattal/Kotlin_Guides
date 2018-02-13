/**
 * Created by Abed on 1/29/2018.
 */
fun foo(k:Int){
    //If the passed Argument is less then 10 it will produce "an error Exception in thread java.lang.IllegalArgumentException: k should be greater than 10
     require(k>10, {"k should be greater than 10"})
}

fun main(args:Array<String>){
    foo(10)
}