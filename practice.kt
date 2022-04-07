
////////task 3 40, 50 min
fun main() {

    var list = listOf<Int>(1,2,3,4,5,6,7,8 )
    val indices=IndicesSum(list, 7)
    println(indices.first)
    println(indices.second)
    
 }
 fun IndicesSum(list:List<Int>, x:Int):Pair<Int,Int> {
     var indice:Int = 0
     var indice1:Int= 0
     for(i in 0..list.size-1){
         for(j in 1..list.size-1){
                if(list[i]+list[j]==x)
                 {
                  indice = i
                  indice1 = j
                  break
                 }
         }
     }
     return Pair(indice,indice1)
 }
 