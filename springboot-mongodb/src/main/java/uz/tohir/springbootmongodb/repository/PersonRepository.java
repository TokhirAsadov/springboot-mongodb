package uz.tohir.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import uz.tohir.springbootmongodb.entity.Person;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person,String> {

    List<Person> findByFirstNameStartsWith(String name);

//    List<Person> findByAgeBetween(Integer min, Integer max);

    @Query(value = "{'age' : { $gt : ?0, $lt : ?1 }}",
    fields = "{addresses: 0}") // addresses <- field ini uchirib qaytaradi
    List<Person> findPersonByAgeBetween(Integer min, Integer max);
}
