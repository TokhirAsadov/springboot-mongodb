package uz.tohir.springbootmongodb.service;

import org.springframework.web.multipart.MultipartFile;
import uz.tohir.springbootmongodb.entity.Photo;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image);

    Photo getPhoto(String id);
}
