fun main(arg:Array<String>) {
    val data= User("Abed", "Fattal")
    print(data.fullName)

}

data class User(val firstName:String,val lastName:String)

val User.fullName:String
get() = "$firstName $lastName"




