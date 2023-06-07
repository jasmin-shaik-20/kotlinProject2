fun main(args: Array<String>) {
    //for loop
    var nums=1..10
    for(i in nums)
    {
        println(i)
    }

    var a=10 downTo 1
    for(i in a step 2)
    {
        println(i)
    }

    var fruits= listOf("Apple","mango","banana","Grapes")
    for((i,e) in fruits.withIndex()){
        println("$i : $e")
    }

    //while loop
    var number = 1
    while(number <= 10) {
        println(number)
        number++;
    }

    //do-while loop
    var num = 2
    var i = 1
    do {
        println("$num * $i = "+ num * i)
        i++
    }while(i <= 10)

}