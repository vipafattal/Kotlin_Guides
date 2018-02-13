/**
 * Created by Abed on 1/29/2018.
 */

fun main(args:Array<String>){
    val string = "a kindness of ravens"
    val isContained:Boolean=  string.regionMatches(14, "Red Ravens", 4, 6, true)
    /*
     14: "thisOffset: the starting position of the substring(a kindness of ravens) to compare.
     Red Ravens: other the string against a substring of which the comparison is performed.
     4: the starting position of the compared statement("Red Ravens")
     6: length of the substring to compare (number of the characters that need to be compared).
    * */
    print(isContained)
}