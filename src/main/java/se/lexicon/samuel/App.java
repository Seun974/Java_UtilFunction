package se.lexicon.samuel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


public class App 
{
    public static void main( String[] args ) {

        List<Pet> pets = Arrays.asList(
                new Pet(1, "fluffy", LocalDate.now(),true),
                new Pet(2, "Bingo", LocalDate.parse("2020-01-21"), false),
                new Pet(3, "kent",LocalDate.parse("2015-03-12"), true)
        );

        //List<Pet> result = filterPets(pets, p -> p.isAlive());
        List<Pet> result = filterPets(pets, p -> p.getBirthDate().isLeapYear());

        result.forEach(p -> System.out.println(p));
    }
        //this is for a collection
    public static List<Pet>filterPets(Collection<Pet> source, Predicate<Pet> filter){
        List<Pet> out = new ArrayList<>();
        for(Pet p : source){
            if(filter.test(p)){
                out.add(p);
            }
        }

        return out;
    }

}
