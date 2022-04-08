////////task 3 40, 50 min
fun main() {

    var list = listOf<Int>(3,2,1,4)
    val indicesForSumValues=GetIndicesForSumValues(list, 5)
    println(indicesForSumValues.first)
    println(indicesForSumValues.second)

 }
 fun GetIndicesForSumValues(list:List<Int>, x:Int):Pair<Int,Int> {
     var indiceOfFirstValue:Int = 0
     var indiceOfSecondValue:Int= 0
outerloop@ for(i in list.indices)
     	{
         for(j in 1 until list.size)
    		{
                if((list[i]+list[j])==x)
                 	{
                  indiceOfFirstValue = i
                  indiceOfSecondValue = j
                  break@outerloop
                 	}                
         	}
     	}
     return Pair(indiceOfFirstValue,indiceOfSecondValue)
 }