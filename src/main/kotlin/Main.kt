
fun main(){

    // for the Class
    val human = Human("David", 21, 45.7)
    human.eat(2)
    println(human.weight)
    human.speak("I love Kotlin")
    human.birthday()
    println(human.age)

    // for the data class
    val user = User("Maria","Yohana", "maria@gmail.com", "04947847664", "283d@3667")
    println(user.firstName)
    println(user.lastName)


}

class Human(var name: String, var age: Int, var weight: Double){

    fun eat(foodWeight: Int){

        //prints a sentence and increments humans weight
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }
    //prints the string passed to it
    fun speak(speech: String){
        println(speech)
    }

    // function that increments the human’s age by 1
    fun birthday(){
        age += 1
    }
}

//data class User with that create an instance and print out any 2 attributes
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String)



