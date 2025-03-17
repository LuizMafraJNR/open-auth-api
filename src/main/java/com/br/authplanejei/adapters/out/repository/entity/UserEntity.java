package com.br.authplanejei.adapters.out.repository.entity;

import com.br.authplanejei.application.core.domain.Role;
import com.br.authplanejei.application.core.domain.UserDetails;
import com.br.authplanejei.application.core.domain.enumarated.Status;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity
{
	@Id
	private UUID id;
	private String name;
	private String email;
	private String password;
	@CreationTimestamp
	private LocalDate creationDate;
	@UpdateTimestamp
	private LocalDate updateDate;
	// Criar uma anotation especifica
	private LocalDate lastLoginDate;
	@OneToOne
	@JoinColumn(name = "user_details_id")
	private UserDetailsEntity userDetails;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<RoleEntity> roles;
	private Status status;
}
