/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package mblogftl.core.persist.service;

import java.util.List;

import mblogftl.core.data.Group;

/**
 * TODO: 暂时添加修改都在数据库操作
 * 
 * @author langhsu
 *
 */
public interface GroupService {
	List<Group> findAll(int status);
	Group getById(int id);
	Group getByKey(String key);
	void update(Group group);
	void delete(int id);
}
