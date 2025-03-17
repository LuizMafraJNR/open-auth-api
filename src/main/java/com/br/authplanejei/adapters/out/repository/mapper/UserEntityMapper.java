package com.br.authplanejei.adapters.out.repository.mapper;

import com.br.authplanejei.adapters.out.repository.UserRepository;
import com.br.authplanejei.adapters.out.repository.entity.UserEntity;
import com.br.authplanejei.application.core.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper
{
	UserEntity toUserEntity(User user);
	User toUser(UserEntity userEntity);
}
