package com.br.authplanejei.adapters.out.repository.mapper;

import com.br.authplanejei.adapters.out.repository.entity.RoleEntity;
import com.br.authplanejei.application.core.domain.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleEntityMapper
{
	RoleEntity toRoleEntity(Role role);
	Role toRole(RoleEntity roleEntity);
}
