package com.whackon.witmed.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.entity.system.admin.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>系统功能 - 系统用户数据持久层接口</b>
 *
 * @author mi
 * @date 2022/1/6
 * @since
 */
@Repository
public interface AdminDao extends BaseMapper<Admin> {
}
