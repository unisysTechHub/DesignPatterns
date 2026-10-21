import com.unisystechhub.desingpatterns.Animal;
import com.unisystechhub.desingpatterns.AnimalType;
import com.unisystechhub.desingpatterns.CAT;
import com.unisystechhub.desingpatterns.Dog;

public class AnimalFactory {
    //  absraciton of  creating  instance based on type
    public static Animal createInstance(AnimalType animalType){
        if (animalType == null) {
            throw new IllegalArgumentException("animalType is required");
        }
        return switch (animalType){
            case CAT -> {
                yield new CAT();
            }
            case DOG ->{
                yield new Dog();
            }
        };
    }
}
