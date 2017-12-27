package mblogftl.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mblogftl.base.data.Data;
import mblogftl.core.persist.service.AttachService;
import mblogftl.web.controller.BaseController;

/**
 * @author langhsu on 2015/9/5.
 */
@Controller("mng_attacg_ctl")
@RequestMapping("/admin/posts/album")
public class AttachController extends BaseController {
    @Autowired
    private AttachService attachService;

    @RequestMapping("/delete")
    public @ResponseBody
    Data delete(Long id) {
        Data data = Data.failure("操作失败");
        if (id != null) {
            try {
                attachService.delete(id);
                data = Data.success("操作成功", Data.NOOP);
            } catch (Exception e) {
                data = Data.failure(e.getMessage());
            }
        }
        return data;
    }
}
