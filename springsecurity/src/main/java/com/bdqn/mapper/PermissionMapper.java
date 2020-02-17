package com.bdqn.mapper;

import java.util.List;

import com.bdqn.entity.Permission;
import org.apache.ibatis.annotations.Select;

public interface PermissionMapper {

	@Select(" select * from sys_permission ")
	List<Permission> findAllPermission();

}
