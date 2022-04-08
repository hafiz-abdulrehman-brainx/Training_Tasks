////////task 3 40, 50 min
fun main() {

    getIndicesForSumValues(listOf<Int>(3,3,6,4), 7).apply {
    println(first)
    println(second)
    }
    
 }
 fun getIndicesForSumValues(list:List<Int>, x:Int):Pair<Int,Int> {
     var FirstValue:Int = 0
     var SecondValue:Int= 0
     list.apply {     
        outerloop@ for(i in indices)
        {
        for(j in 1 until size)
        {
            if( ( get(i)+get(j) )==x)
                    {
                FirstValue = i
                SecondValue = j
                break@outerloop
                    }                
            }
        }
     }
     return Pair(FirstValue,SecondValue)
 }