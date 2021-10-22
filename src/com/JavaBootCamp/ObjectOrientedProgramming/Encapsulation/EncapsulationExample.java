package com.JavaBootCamp.ObjectOrientedProgramming.Encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setAcc_no(505056056);
        obj.setAmount(101010f);
        obj.setName("Priyanshu");
        System.out.println(obj.getAcc_no());
        System.out.println(obj.getAmount());
        System.out.println(obj.getName());

    }
}
//A Account class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
class Account {
    //private data members
    private long acc_no;
    private String name,email;
    private float amount;
    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

}