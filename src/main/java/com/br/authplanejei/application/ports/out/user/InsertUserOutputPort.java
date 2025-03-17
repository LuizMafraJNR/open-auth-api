package com.br.authplanejei.application.ports.out.user;

import com.br.authplanejei.application.core.domain.User;

public interface InsertUserOutputPort
{
	void insert(User user);
}
