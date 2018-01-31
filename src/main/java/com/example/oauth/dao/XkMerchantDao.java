package com.example.oauth.dao;

import com.example.oauth.model.XkMerchant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XkMerchantDao extends CrudRepository<XkMerchant, Long> {
    XkMerchant findByLoginName(String loginName);

}
