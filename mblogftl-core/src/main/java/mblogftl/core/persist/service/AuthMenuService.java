package mblogftl.core.persist.service;

import java.util.List;

import mblogftl.core.data.AuthMenu;

public interface AuthMenuService {
	
	List<AuthMenu> findByParentId(long parentId);

	List<AuthMenu> tree(Long id);

	List<AuthMenu> listAll();

	AuthMenu get(Long id);

	void save(AuthMenu authMenu);

	void delete(Long id);
}
