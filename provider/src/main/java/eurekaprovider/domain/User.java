package eurekaprovider.domain;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private Integer age;

    public User(){}
    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }




}
