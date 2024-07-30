public class Car {
    int id;
    int powerSource;
    float pricePerDay;

    public Car(int id, int powerSource, float pricePerDay){
        this.id=id;
        this.powerSource=powerSource;
        this.pricePerDay=pricePerDay;
    }

    public Car(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }
    public void setId(int newid){
        this.id=newid;
     }

    public int getPowerSource(){
        return powerSource;
    }

    public void setPowerSource(int newpowerSource){
        this.powerSource=newpowerSource;
    }

    public float getPricePerDay(){
        return pricePerDay;
    }

    public void setPricePerDay(float newpricePerDay) {
        this.pricePerDay=newpricePerDay;
    }

    //for testing 
    public String toString(){
        return "ID: "+id+"\nCar type: "+(powerSource==1 ? "Gasoline": powerSource==2 ? "Hybrid" : powerSource==3 ? "Electric" : "Not Found")+"\nPrice Per Day: $"+String.format("%.2f",pricePerDay);
    }

    public static void main(String[] args){
        Car c=new Car(6,1,4.5f);
        System.out.println(c);
    }



    
}
