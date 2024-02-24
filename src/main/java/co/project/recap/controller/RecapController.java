package co.project.recap.controller;

import co.project.recap.model.CategoryResponseDTO;
import co.project.recap.service.RecapService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/recap")
public class RecapController {

    @Autowired
    RecapService recapService;


    private static final Logger logger = LoggerFactory.getLogger("recap");

    /**
     * 카테고리
     **/
    @GetMapping(value = "libaray-category")
    public CategoryResponseDTO getLibarayCategory() throws Exception {
        logger.info("getLibarayCategory START>>>>>>>>>>>>>>>>> \n");
        return recapService.getLibarayCategory();
    }

    /**
     * 상품 복원
     **/
/*    @PostMapping(value = "/restoreOrder")
    public ClientResponseDTO restore(@RequestBody Map<String, Object> param, HttpServletResponse response) throws Exception {
        logger.info("restore order >>>>>>>>>>>>>>>>>> \n"+param);
        return recapService.restoreOrder(param);
    }*/


    /**
     * FanPlus 구매가능 여부
     **/
/*    @PostMapping(value = "/purchaseCheck")
    public PlusPurchaseCheckResponseDTO plusPurchaseCheck(@RequestBody PlusPurchaseCheckDTO param, HttpServletResponse response) throws Exception {
        logger.info("purchaseCheck FanPlus >>>>>>>>>>>>>>>>>> \n"+param.toString());
        return plusStoreService.plusPurchaseCheck(param);
    }*/
}
