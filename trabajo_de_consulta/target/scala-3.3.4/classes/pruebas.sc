/*función*/
def f(n: Int): Int= (1 to n).product
f(4)
/*función anónima*/
val a= (x:Int)=> (1 to x).product
a(4)