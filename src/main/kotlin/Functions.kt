fun main(args: Array<String>){
    var c=sum(2,3)
    println(c)
    myFunction("John")
    myFunction("Jane")
    myFunction("George")
}

fun sum(a:Int,b:Int):Int{
    var result=a+b;
    return result
}

//passing parameters
fun myFunction(fname: String) {
    println(fname + " Doe")
}

