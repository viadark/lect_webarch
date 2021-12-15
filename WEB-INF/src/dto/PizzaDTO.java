package dto;

public class PizzaDTO {
    String name;
    String telno;
    String email;
    String pizza_size;
    String topping_list;
    String deliver_time;
    String req;
    public PizzaDTO(){
        this.name = "";
        this.telno = "";
        this.email = "";
        this.pizza_size = "";
        this.topping_list = "";
        this.deliver_time = "";
        this.req = "";
    }
    public PizzaDTO(String name, String telno, String email, String pizza_size, String topping_list, String deliver_time, String req){
        this.name = name;
        this.telno = telno;
        this.email = email;
        this.pizza_size = pizza_size;
        this.topping_list = topping_list;
        this.deliver_time = deliver_time;
        this.req = req;
    }
    public String getName(){
        return this.name;
    }
    public String getTelno(){
        return this.telno;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPizzaSize(){
        return this.pizza_size;
    }
    public String getToppingList(){
        return this.topping_list;
    }
    public String getDeliverTime(){
        return this.deliver_time;
    }
    public String getReq(){
        return this.req;
    }
}