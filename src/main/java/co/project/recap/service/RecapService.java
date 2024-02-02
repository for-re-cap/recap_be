package co.project.recap.service;

import co.project.recap.model.ClientResponseDTO;
import co.project.recap.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RecapService {

    ClientResponseDTO saveUser(Map<String, Object> param) throws Exception;
}
