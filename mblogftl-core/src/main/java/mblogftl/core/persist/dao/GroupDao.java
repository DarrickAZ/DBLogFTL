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

import mblogftl.core.persist.entity.GroupPO;

import java.util.List;

/**
 * @author langhsu
 *
 */
public interface GroupDao extends JpaRepository<GroupPO, Integer>, JpaSpecificationExecutor<GroupPO> {
	List<GroupPO> findAllByStatus(int status);
	GroupPO findByKey(String key);
}
