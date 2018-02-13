//without companion
class Log(){
    object Factory{

        fun createFileLog(filename:String):Log =Log(filename)
    }
    constructor(fileName: String):this()
    {
    print(fileName)
    }
}

fun main (args:Array<String>){
    Log.Factory.createFileLog("FileName.txt")
}

