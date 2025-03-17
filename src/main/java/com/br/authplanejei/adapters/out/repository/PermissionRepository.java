package com.br.authplanejei.adapters.out.repository;

import com.br.authplanejei.application.core.domain.Permission;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, UUID>
{
}
