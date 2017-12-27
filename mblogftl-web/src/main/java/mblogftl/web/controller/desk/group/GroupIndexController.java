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

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mblogftl.base.lang.Consts;
import mblogftl.core.data.Group;
import mblogftl.core.persist.service.GroupService;
import mblogftl.web.controller.BaseController;
import mblogftl.web.controller.desk.Views;

/**
 * Group 主页
 * @author langhsu
 *
 */
@Controller
public class GroupIndexController extends BaseController {
	@Autowired
	private GroupService groupService;
	
	@RequestMapping("/g/{groupKey}")
	public String root(@PathVariable String groupKey, ModelMap model,
			HttpServletRequest request) {
		// init params
		String order = ServletRequestUtils.getStringParameter(request, "ord", Consts.order.NEWEST);
		Group group = groupService.getByKey(groupKey);
		
		// callback params
		model.put("group", group);
		model.put("ord", order);
		return getView(Views.ROUTE_POST_INDEX);
	}
	
}