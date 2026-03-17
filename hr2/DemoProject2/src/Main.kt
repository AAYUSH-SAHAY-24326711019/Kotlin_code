fun main(){

//-------------------------------------------------
//    var character: Char='c' //uses single quotes.
//    println("character is : $character")
//    val number1 : Int = 34
//    val number2 : Byte =12
//    val number3 : Short =12
//    val number4 : Long =12
//    val number5 : ULong =4u
 //--------------------------------------------------

 //--------------------------------------------------
   // val isActive : Boolean = true

    //making of the arrays
//    var favouriteActivites:Array<String> = arrayOf("cricket","chess","music","programming")
//    println("Array elements : ${favouriteActivites.contentToString()}")
    //above is the primitive datatype list

    //making the user defined datatype ones.

 //--------------------------------------------------

//val user1 : User = User("Aayush","12345", "patna")
//    user1.printDetails()
    val n : String
    println("Enter name:")
    n=readln()
    val p : String
    println("Enter phone:")
    p=readln()
    val a : String
    println("Enter address:")
    a=readln()
val user1 : User = User(n,p,a)
    user1.printDetails()
}

class User(
    val name: String,
    val phone: String,
    val address : String
)
{
    fun printDetails(){
    print(address+" "+name+" "+phone)

    }
}