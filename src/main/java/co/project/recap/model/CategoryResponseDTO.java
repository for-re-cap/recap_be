package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    private List<HashMap<String, Object>> data = new ArrayList<>();

}
