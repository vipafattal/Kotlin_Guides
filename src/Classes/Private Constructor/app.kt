
class Log private constructor(){
   companion object Factory
   {

 fun createFileLog(filename:String):Log =Log(filename)
    }
    constructor(fileName: String):this()
    {
    print(fileName)
    }
}

fun main (args:Array<String>){
    Log.createFileLog("FileName.txt")
    //Log() - compile error
}
