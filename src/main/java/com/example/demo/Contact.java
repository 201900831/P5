package com.example.demo;

public class Contact{
    private String name;
    private String surname;
    private String age;
    private String username;
    private String address1;
    private String address2;
    private String zip;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;



    public Contact(String name, String surname, String username, String age, String address1, String address2, String country, String zip, String cardName, String cardNumber, String cardDate, String cardCvv){
        this.setName(name);
        this.setSurname(surname);
        this.setUsername(username);
        this.setAge(age);
        this.setAddress1(address1);
        this.setAddress2(address2);
        this.setZip(zip);
        this.setCardName(cardName);
        this.setCardNumber(cardNumber);
        this.setCardDate(cardDate);
        this.setCardCvv(cardCvv);

    }

    public String getName(){
        return name;
    }
    public String getCardName(){
        return cardName;
    } 
    public String getCardNumber(){
        return cardNumber;
    } 
    public String getCardDate(){
        return cardDate;
    } 
    public String getCardCvv(){
        return cardCvv;
    }
    public String getZip(){
        return zip;
    }
    public String getAddress1(){
        return address1;
    }
    public String getAddress2(){
        return address2;
    }
    public String getUsername(){
        return username;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setZip(String zip){
        this.zip=zip;
    }
    public void setCardName(String cardName){
        this.cardName=cardName;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber=cardNumber;
    }
    public void setCardDate(String cardDate){
        this.cardDate=cardDate;
    }
    public void setCardCvv(String cardCvv){
        this.cardCvv=cardCvv;
    }
    public void setAddress1(String address1){
        this.address1=address1;
    }

    public void setAddress2(String address2){
        this.address2=address2;
    }
    public String getSurname(){
        return surname;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setName(String name){
        this.name=name;
    }
}