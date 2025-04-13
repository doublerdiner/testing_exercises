package CodingTests.Three;

import java.util.LinkedList;

public class AnimalShelter {

    private final LinkedList<Dog> dogsList = new LinkedList<>();

    private final LinkedList<Cat> catList = new LinkedList<>();

    private int trackingNumber = 1;

    public void enqueue(Animal animal){
        animal.setTrackingNumber(trackingNumber);
        trackingNumber++;
        if(animal instanceof Dog){
            this.dogsList.add((Dog) animal);
        }
        else{
            this.catList.add((Cat) animal);
        }
    }

    public Dog dequeueDog(){
        if(!dogsList.isEmpty()){
            return dogsList.pop();
        }
        return null;
    }

    public Cat dequeueCat(){
        if(!catList.isEmpty()){
            return catList.pop();
        }
        return null;    }

    public Animal dequeueAny(){
        if(!dogsList.isEmpty() && !catList.isEmpty()){
            Dog oldestDog = dogsList.peek();
            Cat oldestCat = catList.peek();
            return oldestDog.getTrackingNumber() < oldestCat.getTrackingNumber()? dequeueDog(): dequeueCat();
        }
        else if(dogsList.isEmpty() && catList.isEmpty()){
            return null;
        }
        else if(dogsList.isEmpty()){
            return dequeueCat();
        }
        return dequeueDog();
    }
}

