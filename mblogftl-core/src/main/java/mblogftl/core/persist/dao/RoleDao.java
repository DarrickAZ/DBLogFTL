package mblogftl.core.persist.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mblogftl.core.persist.entity.RolePO;

public interface RoleDao extends JpaRepository<RolePO, Long>, JpaSpecificationExecutor<RolePO> {
	Page<RolePO> findAllByOrderByIdDesc(Pageable pageable);

}
