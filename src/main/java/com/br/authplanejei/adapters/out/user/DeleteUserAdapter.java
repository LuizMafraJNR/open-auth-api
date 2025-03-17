package com.br.authplanejei.adapters.out.user;

import com.br.authplanejei.adapters.out.repository.UserRepository;
import com.br.authplanejei.application.ports.out.user.DeleteUserByIdOutputPort;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserAdapter implements DeleteUserByIdOutputPort
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void delete(UUID id)
	{
		userRepository.deleteById(id);
	}
}
