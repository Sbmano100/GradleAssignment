package org.example;
//import com.google.gson.Gson;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee{
    int id;
    String name;
    int salary;
    char gender;
    Employee(int id, String name,int salary,char gender){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return ("Employee [Employee Id : "+id+" , Name : "+name+
                " , Salary : "+salary+" , Gender : "+gender);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Employee e=new Employee(100,"Mano",10000,'M');
        Employee e1=new Employee(101,"Nandhu",70000,'M');
        Employee p[]=new Employee[2];
        p[0]=e; p[1]=e1;

        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String jsonString = mapper.writeValueAsString(p);
        System.out.println(jsonString);//using jackson method
        //System.out.println(new Gson().toJson(p));//using Gson method
    }
}