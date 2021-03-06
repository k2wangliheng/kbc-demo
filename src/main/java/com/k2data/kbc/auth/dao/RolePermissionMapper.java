package com.k2data.kbc.auth.dao;

import com.k2data.kbc.auth.model.RolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionMapper {

    void insert(RolePermission rolePermission);

    void delete(Integer roleId, Integer resourceId);

    void update(RolePermission rolePermission);

    List<RolePermission> getByRoleId(Integer roleId);

    List<Integer> getResourceIdByRoleId(Integer roleId);

}
