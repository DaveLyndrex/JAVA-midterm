/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm2;

/**
 *
 * @author 2ndyrGroupA
 */
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    
    public  Customer(String name){
    this.name= name;    
    }
    public String getName(){
        return name;
    }
    public boolean isMember(boolean member){
        return member;
    }
    public void setMember(boolean member){
        this.member= member;
    }
    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String type){
        memberType= type;
    }
    public String toString(){
        return String.format("Customer %1$s %2$s member.", name, (member ? " is a "+memberType: " is not a"));
    }
}
