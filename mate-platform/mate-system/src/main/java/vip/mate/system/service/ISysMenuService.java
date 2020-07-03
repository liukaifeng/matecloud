package vip.mate.system.service;

import com.alicp.jetcache.anno.Cached;
import vip.mate.system.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import vip.mate.system.vo.SysMenuVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author xuzf
 * @since 2020-06-18
 */
public interface ISysMenuService extends IService<SysMenu> {

    @Cached(name="sysMenuService.routes", expire = 3600)
    List<SysMenuVO> routes(String roleId);

    List<SysMenu> searchList(Map<String, Object> search);

    boolean saveAll(SysMenu sysMenu);

    boolean status(String ids, String status);


}
