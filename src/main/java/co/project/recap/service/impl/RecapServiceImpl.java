package co.project.recap.service.impl;

import co.project.common.code.ResponseCode;
import co.project.recap.model.CategoryResponseDTO;
import co.project.recap.repository.RecapDao;
import co.project.recap.service.RecapService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class RecapServiceImpl implements RecapService {


    @Autowired
    private RecapDao recapMapper;

    private static final Logger logger = LoggerFactory.getLogger("bubbleStore");



    /**
     * user API
     */
    @Override
    public CategoryResponseDTO getLibarayCategory() throws Exception {

        CategoryResponseDTO result = new CategoryResponseDTO();
        JSONObject category = new JSONObject();
        try {

            List<HashMap<String, Object>> priorCodeList = recapMapper.getPriorCode("CATE");

            for(HashMap<String, Object> priorCode : priorCodeList){

                List<HashMap<String, Object>> categoryList = recapMapper.getCommonCode(priorCode.get("code").toString());
                category.put((String) priorCode.get("code_name"),categoryList);
            }


            logger.info("###### category : {}", category);

            result.setStatus(true);
            result.setStatusCode(ResponseCode.RESULT_SUCCESS);
            result.setData(category);
            logger.info("###### result : {}", result.toString());

        } catch (Exception e) {
            logger.error("RECAP LIBARAY CATEGORY EXCEPTION : " + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    /**
     * user API
     */
/*    @Override
    public ClientResponseDTO saveUser(Map<String, Object> data) throws Exception {

        ClientResponseDTO result = new ClientResponseDTO();
        // 필수 파라미터 체크
        if (!data.containsKey("osType")){
            logger.info(":::: BUBBLE_OSTYPE_MISSING ::::");
            result.setCode(ResponseCode.BUBBLE_OSTYPE_MISSING);
            result.setMessage("필요 정보가 전달되지 않았습니다. <br />확인 후 다시 시도해 주시기 바랍니다.");
            return result;
        }

        int osType = (int) data.get("osType");
        String locale = data.get("locale").toString();
        String language = data.get("language").toString();*/

        /*// OS별 현지화 구분
        HashMap<String, String> localizationData = CommonUtil.setLocalization(osType, locale, language);
        langCode = localizationData.get("langCode");

        if (!data.containsKey("externalID")){
            logger.info(":::: BUBBLE_EXTERNALID_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_EXTERNALID_MISSING);
            result.setMessage(message);
            return result;
        }
        if (!data.containsKey("userToken")){
            logger.info(":::: BUBBLE_USERTOKEN_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_USERTOKEN_MISSING);
            result.setMessage(message);
            return result;
        }
*/
/*

        try {
            //String name = recapMapper.getUser();
           return result;

        } catch (Exception e) {
            e.printStackTrace();
            throw new CommonException.DefaultParameterException("오류가 발생했습니다.[1]");
        }
    }
*/

    /*public ClientResponseDTO confirmOrder(Map<String, Object> data) throws Exception {

        ClientResponseDTO result = new ClientResponseDTO();

        // 필수 파라미터 체크
        if (!data.containsKey("osType")){
            logger.info(":::: BUBBLE_OSTYPE_MISSING ::::");
            result.setCode(ResponseCode.BUBBLE_OSTYPE_MISSING);
            result.setMessage("필요 정보가 전달되지 않았습니다. <br />확인 후 다시 시도해 주시기 바랍니다.");
            return result;
        }

        int osType = (int) data.get("osType");
        String locale = data.get("locale").toString();
        String language = data.get("language").toString();

        // OS별 현지화 구분
        HashMap<String, String> localizationData = CommonUtil.setLocalization(osType, locale, language);
        langCode = localizationData.get("langCode");

        if (!data.containsKey("externalID")){
            logger.info(":::: BUBBLE_EXTERNALID_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_EXTERNALID_MISSING);
            result.setMessage(message);
            return result;
        }
        if (!data.containsKey("userToken")){
            logger.info(":::: BUBBLE_USERTOKEN_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_USERTOKEN_MISSING);
            result.setMessage(message);
            return result;
        }
//        if (!data.containsKey("appVersion")){
//            result.setCode(ResponseCode.BUBBLE_APPVERSION_MISSING);
//            result.setMessage("필요 정보가 전달되지 않았습니다. <br />확인 후 다시 시도해 주시기 바랍니다.");
//            return result;
//        }
        if (!data.containsKey("productID")){
            logger.info(":::: BUBBLE_PRODUCTID_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_PRODUCTID_MISSING);
            result.setMessage(message);
            return result;
        }
        if (!data.containsKey("dStoreOrderID")){
            logger.info(":::: BUBBLE_DSTOREORDERID_MISSING ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_DSTOREORDERID_MISSING);
            result.setMessage(message);
            return result;
        }

        String externalID = data.get("externalID").toString();
        String appGroup = data.get("appGroup").toString();
        String productID = data.get("productID").toString();
        String dStoreOrderID = data.get("dStoreOrderID").toString();
        String androidOrderID = "";
        String transactionID = "";
        String originalTransactionID = "";

        HashMap<String,String> commonCodeData = commonDao.selectCommonCodeAppGroup(appGroup);
        helpEmail = commonCodeData.get("HelpEmail");

        if (0 == osType) {
            JSONParser parser = new JSONParser();
            JSONObject inAppData = (JSONObject) parser.parse(data.get("inAppData").toString());
            androidOrderID = inAppData.get("orderId").toString();
        }else {
            transactionID = data.get("transactionID").toString();
            originalTransactionID = data.get("originalTransactionID").toString();
        }

        String userCode = "";
        // 1. 유저 체크
        StoreUserVO userVO = subscriptionDao.selectUserInfoByExternalID(externalID);
        if (userVO != null) {
            userCode = userVO.getUserCode();
        } else {
            logger.info(":::: BUBBLE_USERDATA_EMPTY ::::");
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setCode(ResponseCode.BUBBLE_USERDATA_EMPTY);
            result.setMessage(message);
            return result;
        }

        // 1-1 테스트 유저 체크
        HashMap<String, String> testParam = new HashMap<>();
        testParam.put("userCode", userCode);
        testParam.put("appGroup", appGroup);
        boolean isTestUser = subscriptionDao.selectIsTestUser(testParam);

        logger.info("externalID >>> \n" + externalID);
        logger.info("dStoreOrderID >>> \n" + dStoreOrderID);
        logger.info("userCode >>> \n" + userCode);
        logger.info("isTestUser >>> \n" + isTestUser);

        try {
            logger.info("------> APM에 저장 <------");
            ElasticAPMSubscribeOrderVO apmSubscribeOrderVO = new ElasticAPMSubscribeOrderVO();
            apmSubscribeOrderVO.setExternalID(externalID);
            apmSubscribeOrderVO.setDStoreOrderID(dStoreOrderID);
            apmSubscribeOrderVO.setOsType(osType);
            apmSubscribeOrderVO.setAppGroup(appGroup);
            apmSubscribeOrderVO.setProductID(productID);
            apmSubscribeOrderVO.setTransactionId(transactionID);
            apmSubscribeOrderVO.setOriginalTransactionId(originalTransactionID);
            apmSubscribeOrderVO.setOrderId(androidOrderID);
            apmSubscribeOrderVO.setReceipt(data.toString());
            apmService.setConfirmOrderData(apmSubscribeOrderVO);
        } catch (Exception e) {
            logger.info("apm exception : " + e.getMessage());
        }

        // 임시 주문서 정보 확인
        HashMap<String,Object> tempOrderInfo = subscriptionDao.checkOrderStatus(dStoreOrderID, appGroup);
        logger.info("***** tempOrderInfo: {}",tempOrderInfo);

        if (0 == osType) {
            // ANDROID 주문
            result = confirmAndroidOrder(data, tempOrderInfo, isTestUser);

        } else if (1 == osType) {
            // IOS 주문
            result = confirmIOSOrder(data, tempOrderInfo, isTestUser);

        }else {
            result.setCode(ResponseCode.BUBBLE_OSTYPE_MISSING);
            String message = redisService.getMsgForCode("9024", langCode.toLowerCase());
            result.setMessage(message);
            return result;
        }

        logger.info("------> 구독이력 정보 갱신이 성공적으로 끝나면 클라이언트에 pvpush 전송 <------");
        chatService.sendChatPvPush(externalID,
                CommonCode.ChatPvPushType.COMMON_ROOMLIST_CHECK_TYPE.setData(externalID));

        return result;
    }*/

    /*@Override
    public PlusPurchaseCheckResponseDTO plusPurchaseCheck(PlusPurchaseCheckDTO data) throws Exception {

        // 필수 파라미터 체크
        if (!data.checkOrderValidParam()) {
            throw new CommonException.PlusOrderNotValidException();
        }

        // 요청타입
        int notificationType = 1;   // 1 : 결제 확인
        int eventIdx = -1;   // insertPlusEventLog idx

        String appGroup = data.getAppGroup();
        String PMID = data.getPmid();
        String productGroupLinkedKey = data.getProductGroupLinkedKey();
        String checksum = data.getChecksum();
        String paymentMethod = "9";

        PlusPurchaseCheckResponseDTO result = new PlusPurchaseCheckResponseDTO();

        try {
            // 이벤트 로그 저장
            PlusEventDTO PlusEventDTO = new PlusEventDTO();
            PlusEventDTO.setPlusNotiType(notificationType);
            PlusEventDTO.setPMID(PMID);
            PlusEventDTO.setEventData(data.toString());
            PlusEventDTO.setAppGroup(appGroup);
            subscriptionDao.insertPlusEventLog(PlusEventDTO);
            eventIdx = PlusEventDTO.getIdx();
        } catch (Exception e) {
            logger.error("########## PLUS_ETC_ERROR ##########");
            logger.error("Plus insertPlusEventLog exception : " + e.getMessage());
            e.printStackTrace();
        }

        try {
            // 위변조 체크
            String encryptKey = checkKey + appGroup + PMID + productGroupLinkedKey;
            String compareData = CommonUtil.encryptSHA256(encryptKey);

            // checksum 오류
            if (!compareData.equals(checksum.toLowerCase())) {
                result.setStatus(false);
                result.setStatusCode(ResponseCode.PLUS_CHECKSUM_ERROR);
                throw new Exception(":::::::::: FANPLUS_CHECKSUM_ERROR ::::::::::");
            }

            String userCode = "";
            // 1. 유저 체크
            String useridx = adminStarTalkDao.selectUseridxInfoByPMID(PMID);
            if (useridx == null || useridx.isEmpty()) {
                result.setStatus(false);
                result.setStatusCode(ResponseCode.PLUS_USER_ERROR);
                throw new Exception(":::::::::: useridx is Null ::::::::::");
            }
            StoreUserVO userVO = subscriptionDao.selectUserInfoByExternalID(useridx);
            if (userVO != null) {
                userCode = userVO.getUserCode();
            } else {
                result.setStatus(false);
                result.setStatusCode(ResponseCode.PLUS_USER_ERROR);
                throw new Exception(":::::::::: userVO is Null ::::::::::");
            }

            // 2. 해당 상품 리스트 조회
            HashMap<String, Object> optionParam = new HashMap<>();
            optionParam.put("productGroupLinkedKey", data.getProductGroupLinkedKey());
            optionParam.put("appGroup", data.getAppGroup());
            List<String> optionIDList = subscriptionDao.selectProductOptionList(optionParam);

            // 3. 유저 보유 이용권 조회
            HashMap<String, Object> param = new HashMap<>();
            param.put("userCode", userCode);
            param.put("optionIDList", optionIDList);
            param.put("paymentMethod", paymentMethod);
            param.put("appGroup", data.getAppGroup());
            List<String> userPurchaseLinkageKeyList = subscriptionDao.selectUserPurchaseLinkageKey(param);

            // 4. response 파싱
            ArrayList<HashMap<String, String>> array = new ArrayList<>();
            for (Object userPurchaseLinkageKey : userPurchaseLinkageKeyList) {
                HashMap<String, String> map = new HashMap<>();
                map.put("productLinkedKey", userPurchaseLinkageKey.toString());
                array.add(map);
            }
            result.setStatus(true);
            result.setStatusCode(ResponseCode.RESULT_SUCCESS);
            result.setList(array);

        } catch (Exception e) {
            logger.error("PLUS PURCHASE CHECK EXCEPTION : " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (eventIdx != -1) {
                HashMap<String, Object> param = new HashMap<>();
                param.put("response", new ObjectMapper().writeValueAsString(result));
                param.put("idx", eventIdx);
                subscriptionDao.updatePlusEventLog(param);
            }
        }
        return result;
    }*/

}


