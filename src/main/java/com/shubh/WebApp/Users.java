package com.shubh.WebApp;

public class Users{
    private int ID;
    private String Name;

    public Users(int ID,String name) {
        this.ID = ID;
        this.Name = name;
    }

    public int getID(){
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
