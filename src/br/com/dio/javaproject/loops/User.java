package br.com.dio.javaproject.loops;

import java.util.Date;
import java.util.Scanner;

public class User {

    Scanner scan = new Scanner(System.in);
    String username, fullName;
    int age;


    public User(){
    }

    public User(String username, String fullname, int age){
        super();
        this.username = username;
        this.fullName = fullname;
        this.age = age;
    }

    private void setFullName(String fullName){

        this.fullName = fullName;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFullName(){

        return fullName;

    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

}
