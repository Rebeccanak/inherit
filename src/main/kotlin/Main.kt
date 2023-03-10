
fun main() {
    var becky = Car("Toyota","New","Pink",4)
    becky.carry(6)
    becky.carry(3)
    becky.identity()
    println(becky.calculateParkingfees(3))
    var buses = Bus("zuku","old","Blue",24,10.10)
    println(buses.maxTripFare(20.10))
    buses.calculateParkingfees(10)
    println(buses.calculateParkingfees(10))
    buses.identity()
    buses.carry(4)


}
open class Person(var make :String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x= (people-capacity)
        if (people <= capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity $x people")
        }
    }

    fun identity(){
        println("I am a $color $make $model ")
    }
    open fun calculateParkingfees(hours:Int):Int{
        var fees = hours*20
        return fees
    }
}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
open class Car( make :String,  model:String,  color:String,  capacity:Int):Person(make,model,color,capacity){
//    he bus’ calculateParkingFees method returns the product of hours and
//    the capacity of the bus
}




class Bus( make :String,  model:String,  color:String,  capacity:Int, var fare:Double):Person(make,model,color,capacity){

    //    In addition, it has another method called maxTripFare(fare: Double) that
//    calculates and returns the maximum amount of fare that can be collected per Trip
    fun maxTripFare(fare: Double):Double{
        var maximum = fare*capacity
        return (maximum)
    }



    override   fun calculateParkingfees(hours:Int):Int{
        var fees = hours*capacity
        return fees

    }



}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
//
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
//
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
