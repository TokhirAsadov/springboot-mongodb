package uz.tohir.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.tohir.springbootmongodb.entity.Photo;

public interface PhotoRepository extends MongoRepository<Photo,String> {
}
