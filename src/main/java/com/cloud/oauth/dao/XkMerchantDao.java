package com.cloud.oauth.dao;

import com.cloud.oauth.model.XkMerchant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XkMerchantDao extends CrudRepository<XkMerchant, Long> {
    XkMerchant findByLoginName(String loginName);

}
