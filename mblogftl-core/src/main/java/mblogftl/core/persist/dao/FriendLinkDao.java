package mblogftl.core.persist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mblogftl.core.persist.entity.FriendLinkPO;

import java.util.List;

/**
 * @author Beldon
 */
public interface FriendLinkDao extends JpaRepository<FriendLinkPO, Long>, JpaSpecificationExecutor<FriendLinkPO> {
    List<FriendLinkPO> findAllByOrderBySortDesc();
}
