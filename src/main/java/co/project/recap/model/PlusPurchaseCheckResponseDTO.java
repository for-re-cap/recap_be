package co.project.recap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author :
 * @package : com.ba.subscribe.api.vo.china
 * @name : PlusPurchaseCheckResponseDTO.java
 * @date : 2023-11-24 15:21
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlusPurchaseCheckResponseDTO extends PlusCommonResponseDTO {

    private ArrayList<HashMap<String, String>> list = new ArrayList<>();
}
