package com.br.authplanejei.application.core.domain.enumarated;

public enum Status
{
	ACTIVE(1),
	INACTIVE(2),
	DELETED(3);

	private final int value;

	Status(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}
