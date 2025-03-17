package com.br.authplanejei.adapters.out.user;

import com.br.authplanejei.adapters.out.repository.UserRepository;
import com.br.authplanejei.adapters.out.repository.mapper.UserEntityMapper;
import com.br.authplanejei.application.core.domain.User;
import com.br.authplanejei.application.ports.out.user.FindUserByIdOutputPort;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindUserByIdAdapter implements FindUserByIdOutputPort
{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserEntityMapper userEntityMapper;

	@Override
	public Optional<User> find(UUID id)
	{
		var userEntity = userRepository.findById(id);
		return userEntity.map(userEntityMapper::toUser);
	}
}
