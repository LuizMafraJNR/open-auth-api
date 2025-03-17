package com.br.authplanejei.adapters.out.user;

import com.br.authplanejei.adapters.out.repository.UserRepository;
import com.br.authplanejei.adapters.out.repository.mapper.UserEntityMapper;
import com.br.authplanejei.application.core.domain.User;
import com.br.authplanejei.application.ports.out.user.UpdateUserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserAdapter implements UpdateUserOutputPort
{

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserEntityMapper userEntityMapper;

	@Override
	public void update(User user)
	{
		var userEntity = userEntityMapper.toUserEntity(user);
		userRepository.save(userEntity);
	}
}
