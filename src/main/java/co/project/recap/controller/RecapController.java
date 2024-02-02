package co.project.recap.controller;

import co.project.common.exception.CommonException;
import co.project.common.util.AESCipher;
import co.project.recap.model.ClientResponseDTO;
import co.project.recap.model.PlusPurchaseCheckDTO;
import co.project.recap.model.PlusPurchaseCheckResponseDTO;
import co.project.recap.model.User;
import co.project.recap.service.RecapService;
import co.project.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/recap")
public class RecapController {

    @Autowired
    RecapService recapService;


    private static final Logger logger = LoggerFactory.getLogger("recap");

    /**
     * 상품 구매
     **/
    @PostMapping(value = "/confirmOrder")
    public ClientResponseDTO order(@RequestBody Map<String, Object> param, HttpServletResponse response) throws Exception {
        logger.info("confirm order >>>>>>>>>>>>>>>>> \n"+param);
        return recapService.saveUser(param);
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
