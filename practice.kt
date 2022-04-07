fun main() {
    
    ///////////task 1 3 min
   for(i in 1..200)
    {
        if(i%5==0 && i%7==0)
        println("FooBar")
        else if (i%5==0)
        println("Foo")
        else if(i%7==0)
        println("Boo")
        else
        println(i)
        
    }
}