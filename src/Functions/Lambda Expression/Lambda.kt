fun main(args: Array<String>) {
    //If we're sending only one Argument, we can get rid of the parentheses
    fib {
        println("World")
        return@fib 1000
    }
    //If the last argument of a function is also a function, we can move it out of the parentheses:
    Somefun(10) {
        print("Hi!!")
    }
    //In order to have an Idea about deference between inline fun and non-inline fun when using lambda see the byte code
    // in inline fun [fib] we are not creating an instance (object) for the invoked fun
}

inline fun fib(op: () -> Int) {
    print("Hello")
    val x = op()
    print(x)
}
fun Somefun(x:Int,op2:()-> Unit){
    print("ello")
    op2()
    print(x+5)
}




