package com.sspd.OOp_1;

import java.rmi.StubNotFoundException;

public class Student {

    private String name;
    private int age;
    private String phone;

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;

    }
    public int age(){
        return age;
    }


public int getAge(){
        return age();

}
public void setAge(int age){
        this.age = age ;

}
public String getPhone(){
        return phone;

}
public void setPhone(String phone){
        this.phone= phone;
}

Student(String name,int age,String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;


}}

class room{

    public static void main(String[] args) {
        Student st = new Student("Kyaw Kyaw",20,"0998887685");

        System.out.println(st.getName()+" "+st.getAge()+" "+st.getPhone());



    }



}




