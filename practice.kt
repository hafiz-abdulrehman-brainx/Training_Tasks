fun main() {
    
    ///////////task 1 3 min
   for(number in 1..200)
    {
        if(number%5==0 && number%7==0)
        println("FooBar")
        else if (number%5==0)
        println("Foo")
        else if(number%7==0)
        println("Boo")
        else
        println(number)
        
    }
}