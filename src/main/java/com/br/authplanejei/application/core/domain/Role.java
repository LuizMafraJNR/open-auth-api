package com.br.authplanejei.application.core.domain;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Role
{
	private UUID id;
	private String name;
	private Set<Permission> permissions;

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

	public Set<Permission> getPermissions()
	{
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions)
	{
		this.permissions = permissions;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		Role role = (Role) o;
		return Objects.equals(id, role.id) && Objects.equals(name, role.name) && Objects.equals(
			permissions, role.permissions);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, name, permissions);
	}
}
