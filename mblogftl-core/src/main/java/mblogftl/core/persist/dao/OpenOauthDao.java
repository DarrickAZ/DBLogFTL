/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package mblogftl.core.persist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mblogftl.core.persist.entity.OpenOauthPO;

/**
 * 第三方开发授权登录
 * @author langhsu on 2015/8/12.
 */
public interface OpenOauthDao extends JpaRepository<OpenOauthPO, Long>, JpaSpecificationExecutor<OpenOauthPO> {
    OpenOauthPO findByAccessToken(String accessToken);

    OpenOauthPO findByOauthUserId(String oauthUserId);
    
    OpenOauthPO findByUserId(long userId);
}
