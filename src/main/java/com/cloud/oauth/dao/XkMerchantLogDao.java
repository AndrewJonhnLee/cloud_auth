package com.cloud.oauth.dao;

import com.cloud.oauth.model.XkMerchantlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XkMerchantLogDao extends CrudRepository<XkMerchantlog, Long> {

}
