package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.JSONObject;

/**
 * @author :
 * @package :
 * @name : CategoryResponseDTO.java
 * @date :
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponseDTO extends CommonResponseDTO {

    private JSONObject data = new JSONObject();
    //private ArrayList<HashMap<String, String>> list = new ArrayList<>();
}
