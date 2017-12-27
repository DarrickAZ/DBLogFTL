package mblogftl.core.hook.event;

import org.springframework.stereotype.Component;

import mblogftl.core.event.FeedsEvent;


/**
 * 处理FeedsEvent钩子
 *
 * @author Beldon 2015/10/29
 */
@Component
public class FeedsEventHook extends EventHookSupport<FeedsEvent> {

    /**
     * 初始化时获取该钩子的插件
     */
    @Override
    public void init() {
        this.plugins = getPlugins(FeedsEventListener.class);
    }

    @Override
    public void onApplicationEvent(FeedsEvent event) {
        super.onEvent(event);
    }


    public interface FeedsEventListener extends EventListener<FeedsEvent> {

    }

}
