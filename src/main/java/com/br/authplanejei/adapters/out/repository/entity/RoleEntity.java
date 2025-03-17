package com.br.authplanejei.adapters.out.repository.entity;

import com.br.authplanejei.application.core.domain.Permission;
import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class RoleEntity
{
	@Id
	private UUID id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	@ManyToMany
	@JoinTable(
		name = "role_permissions",
		joinColumns = @JoinColumn(name = "role_id"),
		inverseJoinColumns = @JoinColumn(name = "permission_id")
	)
	private Set<PermissionEntity> permissions;
}
