import kotlin.properties.Delegates

var capital: String by Delegates.vetoable("Pleas Enter Capital Starts with D") { _, _, newValue -> newValue.startsWith("D") }
var heightFromOcean:Int by Delegates.observable(0){property, oldValue, newValue ->
    println(newValue)
}
fun main(args: Array<String>) {
    capital = "Washington"
    heightFromOcean=1500
    println(capital)
    capital = "Damascus"
    heightFromOcean=1000
    println(capital)
}