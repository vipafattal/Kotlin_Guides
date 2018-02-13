//with companion
class Log(){
   companion object Factory{
       /*
       You should only use @JvmStatic for Java compatibility when a Java static method is required. @JvmStatic will generate an additional
       static method callable from Java that will actually call the non-static method in the companion object.
        So there will be zero performance benefit and one additional method.
        */
       /*
       so @JvmStatic it's for making that function callable from java
       "an additional static method callable from Java"
        */
     @JvmStatic fun createFileLog(filename:String):Log =Log(filename)
    }
    constructor(fileName: String):this()
    {
    print(fileName)
    }
}

fun main (args:Array<String>){
    Log.createFileLog("FileName.txt")
}
//without companion
