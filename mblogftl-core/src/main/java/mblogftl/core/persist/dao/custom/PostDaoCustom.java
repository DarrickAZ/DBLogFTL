package mblogftl.core.persist.dao.custom;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mblogftl.core.data.Post;

/**
 * Created by langhsu on 2017/9/30.
 */
public interface PostDaoCustom {
    Page<Post> search(Pageable pageable, String q) throws Exception;
    Page<Post> searchByTag(Pageable pageable, String tag);
    void resetIndexs();
}
