/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package mblogftl.web.controller.desk.group;

import mblogftl.core.biz.PostBiz;
import mblogftl.core.data.Post;
import mblogftl.core.persist.service.PostService;
import mblogftl.web.controller.BaseController;
import mblogftl.web.controller.desk.Views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文章浏览
 * 
 * @author langhsu
 * 
 */
@Controller
@RequestMapping("/view")
public class GroupViewController extends BaseController {
	@Autowired
	private PostBiz postBiz;
	@Autowired
	private PostService postService;

	@RequestMapping("/{id}")
	public String view(@PathVariable Long id, ModelMap model) {
		Post ret = postBiz.getPost(id);
		
		Assert.notNull(ret, "该文章已被删除");
		
		postService.identityViews(id);
		model.put("ret", ret);
		return getView(Views.ROUTE_POST_VIEW);
	}
}
