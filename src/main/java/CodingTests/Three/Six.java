package CodingTests.Three;

public class Six {

    public static void main(String[] args) {
        AnimalShelter testAnimalShelter = getTestAnimalShelter();

        for(int i=0; i<10; i++){
            System.out.println(testAnimalShelter.dequeueAny().getClass());
        }

        AnimalShelter test2 = getTestAnimalShelter();

        // Expected order : Dog Dog Dog
        for(int i=0; i<3; i++){
            System.out.println("Test 2 Remove 3 Dogs: " + test2.dequeueDog().getClass());
        }

        // Expected order : Cat Cat Cat Dog Dog Cat Cat
        for(int i=0; i<7; i++){
            System.out.println("Test 2 Empty All " + test2.dequeueAny().getClass());
        }

    }

    private static AnimalShelter getTestAnimalShelter() {
        AnimalShelter response = new AnimalShelter();
        response.enqueue(new Dog());
        response.enqueue(new Dog());
        response.enqueue(new Cat());
        response.enqueue(new Cat());
        response.enqueue(new Cat());
        response.enqueue(new Dog());
        response.enqueue(new Dog());
        response.enqueue(new Dog());
        response.enqueue(new Cat());
        response.enqueue(new Cat());
        return response;
    }
}
