public class Game {
    private double price;
    private String description;
    private String name;
    public Game(double Cost, String Description, String Name){
        this.price = Cost;
        this.description = Description;
        this.name = Name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public void giveDescription(){
        if(this.price == 0.0){
            System.out.println("At no cost, " + this.name + " " + this.description); 
        }
        else{
            System.out.println("For " + price + "$, " + this.name + " " + this.description); 
        }
    }
}
