package co.project.recap.service;

import co.project.recap.model.CategoryResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RecapService {

    //ClientResponseDTO saveUser(Map<String, Object> param) throws Exception;
    CategoryResponseDTO getLibarayCategory() throws Exception;
}
