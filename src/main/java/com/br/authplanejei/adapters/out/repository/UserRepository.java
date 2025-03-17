package com.br.authplanejei.adapters.out.repository;

import com.br.authplanejei.adapters.out.repository.entity.UserEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID>
{
}
