fun main(){
index()
   println(par("Victorine", 20))
    println(length("Victroine"))
call("Victorine","That's me!")
}
fun index () {
    val name = "akirachix"
    val a: Char = name[0]
    val b: Char = name[2]
    val c: Char = name[3]
    println("$a$b$c")
}

fun par(name:String, age:Int):String{
    var name = "Victorine"
    var age=20
    var ageToString= age.toString()
    return "Hi, my name is $name and I am $ageToString years old"
}
fun length(name:String):Int{
    var len = name.length
    return len
}

fun call (name: String, output:String){
    if (name== "Victorine") {
println(output)
    }
else{
    println("I don't know who that is")
    }
}
