package org.mbov.cloud.sso.service;

import java.util.List;

import org.mbov.cloud.sso.entity.SysPermission;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);

}
