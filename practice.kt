
////////task 3 40, 50 min
fun main() {

    var list = listOf<Int>(3,2,1,4)
    val indices=IndicesSum(list, 5)
    println(indices.first)
    println(indices.second)
    
 }
 fun IndicesSum(list:List<Int>, x:Int):Pair<Int,Int> {
     var indice:Int = 0
     var indice1:Int= 0
outerloop@ for(i in 0..list.size-1)
     	{
         for(j in 1..list.size-1)
    		{
//              println("comparing i= $i and j= $j and sum is ${list[i]+list[j]}")
                if((list[i]+list[j])==x)
                 	{
                  indice = i
                  indice1 = j
                  break@outerloop
                 	}                
         	}
     	}
     return Pair(indice,indice1)
 }
 