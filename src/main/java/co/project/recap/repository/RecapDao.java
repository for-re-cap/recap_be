package co.project.recap.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface RecapDao {
    List<HashMap<String, Object>> getPriorCode(String commonCode) throws Exception;
    List<HashMap<String, Object>> getCommonCode(String commonCode) throws Exception;
    //String getUser() throws Exception;
}