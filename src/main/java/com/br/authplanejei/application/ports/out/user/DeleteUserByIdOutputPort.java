package com.br.authplanejei.application.ports.out.user;

import java.util.UUID;

public interface DeleteUserByIdOutputPort
{
	void delete(UUID id);
}
