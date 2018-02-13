class app() {
    var Customer: Double = 0.0
        get() = field
        set(value) {
            if (value > 100)
                field = value
        }
    var geust: Double = 0.0

}

fun main(args: Array<String>) {
    val app = app()
    /*the set and get are there in Default but customize our field variable we use set and get*/
    println(app.Customer)
    app.Customer = 75.0
    println(app.Customer)
    app.Customer = 150.0
    println(app.Customer)
    app.geust = 200.0
    println(app.geust)
}