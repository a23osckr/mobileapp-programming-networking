package com.example.networking;

public class Mountain {

    private String name;
    private String location;
    private int size;

    public Mountain(){
        name="Saknar namn";
        location="Saknar plats";
        size=-1;
    }

    public Mountain(String n, String l, int s){
        name=n;
        location=l;
        size=s;
    }

    public String info(){
        String tmp = new String();
        tmp+=name+" is located in "+location+" and reaches "+size+"m above sea level";
        return tmp;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
