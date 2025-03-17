package com.br.authplanejei.adapters.out.user;


import com.br.authplanejei.adapters.out.repository.UserRepository;
import com.br.authplanejei.adapters.out.repository.mapper.UserEntityMapper;
import com.br.authplanejei.application.core.domain.User;
import com.br.authplanejei.application.ports.out.user.InsertUserOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertUserAdapter implements InsertUserOutputPort
{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserEntityMapper userEntityMapper;

	@Override
	public void insert(User user)
	{
		var userEntity = userEntityMapper.toUserEntity(user);
		userRepository.save(userEntity);
	}
}
