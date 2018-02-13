class UserInput<T, F> {
    constructor(n1: T, n2: F) {
        println(n1)
        println(n2)
    }
    fun <T> myFun(trial: T) {
        println(trial)
    }
}
fun main(agrs: Array<String>) {
    var gen = UserInput<String, Double>("Hello World", 55.5)
    var gen1 = UserInput<Int, Float>(50, 5.0f)

    gen.myFun(10)
    gen.myFun("CodeBox")
    gen1.myFun(10.5f)


}
