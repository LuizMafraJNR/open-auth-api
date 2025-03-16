package com.br.authplanejei.application.core.domain;

import com.br.authplanejei.application.core.domain.enumarated.Status;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class User
{
	private UUID id;
	private String name;
	private String email;
	private String password;
	private LocalDate creationDate;
	private LocalDate updateDate;
	private LocalDate lastLoginDate;
	private UserDetails userDetails;
	private Set<Role> roles;
	private Status status;

	public UUID getId()
	{
		return id;
	}

	public void setId(UUID id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public LocalDate getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate)
	{
		this.creationDate = creationDate;
	}

	public LocalDate getUpdateDate()
	{
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate)
	{
		this.updateDate = updateDate;
	}

	public LocalDate getLastLoginDate()
	{
		return lastLoginDate;
	}

	public void setLastLoginDate(LocalDate lastLoginDate)
	{
		this.lastLoginDate = lastLoginDate;
	}

	public UserDetails getUserDetails()
	{
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails)
	{
		this.userDetails = userDetails;
	}

	public Set<Role> getRoles()
	{
		return roles;
	}

	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}

	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		User user = (User) o;
		return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email,
			user.email) && Objects.equals(password, user.password) && Objects.equals(creationDate,
			user.creationDate) && Objects.equals(updateDate, user.updateDate) && Objects.equals(
			lastLoginDate, user.lastLoginDate) && Objects.equals(userDetails, user.userDetails)
			&& Objects.equals(roles, user.roles) && status == user.status;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, name, email, password, creationDate, updateDate, lastLoginDate,
			userDetails, roles, status);
	}
}
