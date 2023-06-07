fun main(args: Array<String>) {

    //if else condition
   var a=10
    var b=20
    var c=if(a>b){
        "$a is greater than $b"
    }
    else if(a<b){
        "$a is less than $b"
    }
    else{
        "$a is equal to $b "
    }
    println(c)

    //when condition
    var num=3
    var result=when(num){
        1->"One"
        2->"Two"
        3->"Three"
        else->"Give a proper value"
    }
    println(result)

}