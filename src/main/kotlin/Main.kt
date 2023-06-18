
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
    val wolf = Care("Toyota","KNB345","Pink",10)
    wolf.carrying(12)
    wolf.identity()
    println(wolf.calculateParkingFes(5))
    var big = Buses("Zuku","KB13","Indigo",13)
    big.maxTripFare(5.0)
    println(big.calculateParkingFes(6))


}
open class Car(var make :String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
//        var x= (people-capacity)
        if (people <= capacity){
            println("Carrying $people passengers")
        }
        else{
            var x= (people-capacity)
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





class Bus( make :String,  model:String,  color:String,  capacity:Int, var fare:Double):Car(make,model,color,capacity){

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
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)
open class Care(var makes: String, var models: String, var colors: String, var capacitys: Int){
    fun carrying(peoples: Int){
        if (peoples <= capacitys){
            println("Carryings $peoples passengers")
        }
        else{
            var x = (peoples-capacitys)
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $colors $makes $models ")
    }
   open fun calculateParkingFes(hour: Int):Int{
        var parkingFes = hour*20
        return parkingFes
    }
}
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
 class Buses( makes: String, models: String,  colors: String,  capacitys: Int):Care(makes,models,colors,capacitys){
     fun maxTripFare(fare: Double):Double{
         var maxmumfare = fare*capacitys
         return maxmumfare
     }

    override fun calculateParkingFes(hour: Int): Int {
        var fees = hour*capacitys
        return fees
    }
 }

