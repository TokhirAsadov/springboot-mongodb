package uz.tohir.springbootmongodb.service;

import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.tohir.springbootmongodb.entity.Person;

import java.util.List;

public interface PersonService {
    String sava(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);

    Page<Person> search(String name, Integer minAge, Integer maxAge,String city, Pageable pageable);

    List<Document> getOldestPersonByCity();


    List<Document> getPopulationByCity();
}
