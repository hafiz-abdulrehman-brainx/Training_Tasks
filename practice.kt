fun main() {
    ArithmeticStatements(
    listOf<Int>(2,5,6,7,8,9,5,6),
    listOf<String> ("+", "*", "*","/","-","-","*","+")  
    )
  }
fun ArithmeticStatements (
	list:List<Int>,
	operators: List<String>){
    
    var ExpressionLength = list.size-1
    var Expression =""
    for (i in 0 until ExpressionLength){
		Expression+= list[i]
		Expression+= operators[i]
    }
	Expression+=list[ExpressionLength]
    println(Expression)
    
}
