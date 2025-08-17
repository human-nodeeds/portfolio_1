package model;

public class Contact {
    private int id;
    private String name ;
    private String email;
    private String number;
    private String message ;

    Contact(int id , String name , String email, String number, String message){
        this.id = id;
        this.name = name ;
        this.email = email;
        this.number= number;
        this.message=message;
    }

    public int getId(){
        return id;
    }    
    public void setId(int id){
        this.id=id;
    }
    public String getName(String name){
       return name;
    }
    public void setName(){
        this.name = name ;
    }
    public String 

}