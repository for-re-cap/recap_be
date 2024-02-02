package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @Author
 * @Project ba-subscribe
 * @Package com.ba.subscribe.api.vo.ClientResponseDTO
 * @Date 2023-07-03 오전 12:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {
    private String code = "success";
    private HashMap<String, String> contents = new HashMap<>();
    private String message = "";
}
