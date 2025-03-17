package com.br.authplanejei.adapters.out.repository.mapper;

import com.br.authplanejei.adapters.out.repository.entity.PermissionEntity;
import com.br.authplanejei.application.core.domain.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionEntityMapper
{
	PermissionEntity toPermissionEntity(Permission permission);
	Permission toPermission(PermissionEntity permissionEntity);
}
