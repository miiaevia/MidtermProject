package com.skilldistillery.mvcbeer.data;

import java.util.List;

import com.skilldistillery.jpabeer.entities.Brewery;

public interface BreweryDAO {

	public Brewery retrieveById(int id);

	public Brewery create(Brewery brewery);

	public List<Brewery> retrieveAllBreweries();

	public Brewery updateBrewery(int id, Brewery brewery);

	public boolean deleteBrewery(int id);

}