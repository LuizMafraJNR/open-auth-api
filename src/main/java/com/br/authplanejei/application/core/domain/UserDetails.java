package com.br.authplanejei.application.core.domain;

import java.time.LocalDate;
import java.util.Objects;

public class UserDetails
{
	private String cpf;
	private String rg;
	private LocalDate bornDate;
	private String phone;
	private String fixedPhone;
	private Address address;

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getRg()
	{
		return rg;
	}

	public void setRg(String rg)
	{
		this.rg = rg;
	}

	public LocalDate getBornDate()
	{
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate)
	{
		this.bornDate = bornDate;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getFixedPhone()
	{
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone)
	{
		this.fixedPhone = fixedPhone;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		UserDetails that = (UserDetails) o;
		return Objects.equals(cpf, that.cpf) && Objects.equals(rg, that.rg) && Objects.equals(bornDate,
			that.bornDate) && Objects.equals(phone, that.phone) && Objects.equals(fixedPhone,
			that.fixedPhone) && Objects.equals(address, that.address);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(cpf, rg, bornDate, phone, fixedPhone, address);
	}
}
