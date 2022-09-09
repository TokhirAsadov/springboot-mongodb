package uz.tohir.springbootmongodb.service;

import lombok.SneakyThrows;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import uz.tohir.springbootmongodb.entity.Photo;
import uz.tohir.springbootmongodb.repository.PhotoRepository;

@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoRepository photoRepository;

    @SneakyThrows
    @Override
    public String addPhoto(String originalFilename, MultipartFile image) {

        Photo photo
                = new Photo();
        photo.setTitle(originalFilename);
        photo.setPhoto(new Binary(BsonBinarySubType.BINARY,image.getBytes()));

        return photoRepository.save(photo).getId();
    }

    @Override
    public Photo getPhoto(String id) {
        return photoRepository.findById(id).get();
    }
}
