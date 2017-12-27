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

import mblogftl.core.persist.entity.LogPO;

/**
 * @author langhsu
 *
 */
public interface LogDao extends JpaRepository<LogPO, Long>, JpaSpecificationExecutor<LogPO> {
}
