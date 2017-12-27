package mblogftl.core.persist.service;

import java.util.List;

import mblogftl.core.data.FriendLink;

/**
 * @author Beldon
 */
public interface FriendLinkService {

    void save(FriendLink friendLink);

    void delete(long id);

    FriendLink findById(long id);

    List<FriendLink> findAll();
}
