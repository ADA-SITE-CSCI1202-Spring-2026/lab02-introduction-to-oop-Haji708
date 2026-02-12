package week03.invoice;
public class Invoice {
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;
    public Invoice(String part_number, String part_description,int quantity,double price){
        this.part_number = part_number;
        this.part_description = part_description;
        this.quantity = quantity;
        this.price = price;
    }
    public String get_part_number(){
        return part_number;
    }
    public String get_part_description(){
        return part_description;
    } 
    public int get_quantity(){
        return quantity;
    } 
    public double get_price(){
        return price;
    }
    public void set_part_number(String part_number){
        this.part_number = part_number;
    }
    public void set_part_description(String part_description){
        this.part_number = part_description;
    }
    public void set_quantity(int quantity){
        if( quantity<0){
            this.quantity =0;
        }
        else{
        this.quantity = quantity;
        }
    }
    public void set_price(double price){
        if(price<0){
            this.price = 0.0;
        }
        else{
            this.price = price;
        }
    }


}