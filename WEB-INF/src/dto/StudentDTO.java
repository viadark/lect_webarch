package dto;

public class StudentDTO {
    String name;
    int age;
    public StudentDTO(){
        name="";
        age=0;
    }
    public StudentDTO(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}