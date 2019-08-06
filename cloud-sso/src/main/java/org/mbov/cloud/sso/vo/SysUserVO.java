package org.mbov.cloud.sso.vo;

import java.util.List;

import org.mbov.cloud.sso.entity.SysUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserVO extends SysUser
{
    
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 1864986949657313213L;
    
    /**
     * 权限列表
     */
    private List<String> authorityList;
    
}
