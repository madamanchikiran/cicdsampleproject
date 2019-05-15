package war.sys.dao;

import war.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: Aaron
 * @Date: 2018/7/10 11:09
 * @Description: 系统用户
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {
	
}
