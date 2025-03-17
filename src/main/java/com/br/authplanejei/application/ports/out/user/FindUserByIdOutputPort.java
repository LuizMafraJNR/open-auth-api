package com.br.authplanejei.application.ports.out.user;

import com.br.authplanejei.application.core.domain.User;
import java.util.Optional;
import java.util.UUID;

public interface FindUserByIdOutputPort
{
	Optional<User> find(UUID id);
}
