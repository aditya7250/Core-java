class Vehicle{
    String VehicleName;
    String fuelUsed;
    boolean VehicleIsNew;
    boolean VehicleIsImported;
    Vehicle(){}
    Vehicle(String vname, String fuel, boolean isnew, boolean isimported){
        VehicleName = vname;
        fuelUsed = fuel;
        VehicleIsNew = isnew;
        VehicleIsImported = isimported;
    }
    String FuelName(){
        return fuelUsed;
    }
    boolean getIsNew(){
        return VehicleIsNew;
    }
    boolean getIsImported(){
        return VehicleIsImported;
    }
    void setFuelName(String f){
        fuelUsed = f;
    }
    void setIsNew(boolean isnew){
       VehicleIsNew = isnew;
    }
    void IsImported(boolean isImp){
        VehicleIsImported = isImp;
    }
};

class Car extends Vehicle{
    Car(String vname, String fuel, boolean isnew, boolean isimported){
    	VehicleName = vname;
        fuelUsed = fuel;
        VehicleIsNew = isnew;
        VehicleIsImported = isimported;
    	
    }
    String getCarName(){
        return VehicleName;
    }
    void setCarName(String n){
        VehicleName = n;
    }  
}

class Bike extends Vehicle{
    Bike(String vname, String fuel, boolean isnew, boolean isimported){
    	
    	VehicleName = vname;
        fuelUsed = fuel;
        VehicleIsNew = isnew;
        VehicleIsImported = isimported;
    }
    String getBikeName(){
        return VehicleName;
    }
    void setBikeName(String n){
        VehicleName = n;
    }
}
class Person{
    String name;
    Car car;
    Bike bike;
    Person(String n, Car c, Bike b){
        name = n;
        car = c;
        bike = b;
    }
    void getPersonDetails(){
        System.out.println(name+" has a "+car.getCarName()+" And Car Runs On "+car.FuelName()+". ");
        
        System.out.println("He Also has a "+bike.getBikeName()+" And bike Runs On "+bike.FuelName());
                                                                             
        System.out.println(car.getCarName() +" Is");
       if (car.getIsNew()) {
    	    System.out.println(" New And " );
       }
    	    else {
    	    System.out.println(" Not New And ");
       }
        if(car.getIsImported()) 
        	{
        	System.out.println("It Is Not Made In India. ");
        	}
        
        else {
        	System.out.println("It Is Made In India. ");
        }

       System.out.println("Where As ");

        System.out.println(bike.getBikeName()+" is");
        if(bike.getIsNew())
        	{
        	System.out.println(" New And ");
        	}
        else {
        	System.out.println(" Not New And ");
        }
        if(bike.getIsImported())
        {
        	System.out.println("It Is Not Made In India. ");
        }
        	else {
        	System.out.println("It Is Made In India. ");
    }
        }
}
class Assignment2{
public static void main(String[] args){
    Bike bike = new Bike("Ducati","Petrol", false, true);
    Car car = new Car("Honda Accord","Diesel", true, false);
    Person p = new Person("Saurabh", car, bike);
    p.getPersonDetails();
}
}
