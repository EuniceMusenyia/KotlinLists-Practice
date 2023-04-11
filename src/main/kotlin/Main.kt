fun main() {
    numbers()
    names()

}
fun numbers(){
    var numbers = listOf(11, 5, 9, 3, 89, 4, )

//    inbuilt list functions
    println(numbers.count())
    println(numbers.min())
    println(numbers.max())
    println(numbers.sum())
    println(numbers.average())
    println(numbers.first())
    println(numbers.last())

//    list sorting
    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(numbers.reversed())



}
fun names (){
    var names = listOf("Orquidea", "Jannissa", "Gabby","Wimmers", "Amanda")
//    list indexing
    println(names[0])
    println(names.get(0))
    println(names.indexOf("Orquidea"))
    println(names.lastIndex)

//    list Iteration
    for (name in names){
        println(name)
    }
    names.forEach { name -> println(name) }


}
