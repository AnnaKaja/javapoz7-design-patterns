package com.sda.factory.animals.Dog;

public class DogFactory {
    public Dog create(String size){
        if("small".equals(size)){
            return new Beagle();
        }else if ("big".equals(size)){
            return new Mastif();
        }else if ("very-small".equals(size)){
            return new York();
        }else {
            return null;
        }
    }
}