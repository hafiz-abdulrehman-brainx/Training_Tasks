
    
fun main() {
    ////////task 2 30-40 mint
    var list = listOf<String>("brainXTechnologies","Hello", "World", "in", "a", "frame" )
    printList(list)
 }
 fun printList(list:List<String>){
     var longest:Int = 0
     for (element in list){
          if(longest<element.length)
         longest = element.length
     }
     var formatTemplate = "%${longest}s"
     for(i in 1..longest+2)
     print("*")
     for (element in list){
      print( "\n*"+formatTemplate.format(element)+"*") 
     }
     print("\n")
     for(i in 1..longest+2)
     print("*")
 }
     
