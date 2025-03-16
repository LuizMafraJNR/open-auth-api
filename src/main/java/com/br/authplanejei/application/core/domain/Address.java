package com.br.authplanejei.application.core.domain;

import java.util.Objects;

public class Address
{
	private String country;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private Integer number;
	private String complement;
	private String zipCode;

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getNeighborhood()
	{
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood)
	{
		this.neighborhood = neighborhood;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public Integer getNumber()
	{
		return number;
	}

	public void setNumber(Integer number)
	{
		this.number = number;
	}

	public String getComplement()
	{
		return complement;
	}

	public void setComplement(String complement)
	{
		this.complement = complement;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(country, address.country) && Objects.equals(state, address.state)
			&& Objects.equals(city, address.city) && Objects.equals(neighborhood, address.neighborhood)
			&& Objects.equals(street, address.street) && Objects.equals(number, address.number)
			&& Objects.equals(complement, address.complement) && Objects.equals(zipCode,
			address.zipCode);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(country, state, city, neighborhood, street, number, complement, zipCode);
	}
}
