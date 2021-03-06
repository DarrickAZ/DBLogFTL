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

import mblogftl.core.persist.entity.VerifyPO;

/**
 * @author langhsu on 2015/8/14.
 */
public interface VerifyDao extends JpaRepository<VerifyPO, Long>, JpaSpecificationExecutor<VerifyPO> {
    VerifyPO findByUserIdAndType(long userId, int type);
    VerifyPO findByUserId(long userId);
}
