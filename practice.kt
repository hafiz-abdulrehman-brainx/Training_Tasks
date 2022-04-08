
    
fun main() {
    ////////task 2 30-40 mint
    printRectangularFrameList(listOf<String>("brainXTechnologies-brainXTechnologies","brainXTechnologies","Hello", "World", "in", "a", "frame" ))
 }
 fun printRectangularFrameList(list:List<String>){
     var longestElement:Int = 0
     for (element in list){
          if(longestElement<element.length)
          longestElement = element.length
     }
     var formatTemplate = "%${-longestElement}s"
     for(i in 1..longestElement+2)
     print("*")
     for (element in list){
      print( "\n*"+formatTemplate.format(element)+"*") 
     }
     print("\n")
     for(i in 1..longestElement+2)
     print("*")
 }
     
