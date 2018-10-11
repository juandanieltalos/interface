package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Amphibian;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Salamander extends AbstractAnimal implements Amphibian
{
	@Override
	public List<String> getParentCharacteristics()
	{
		return Amphibian.super.getCharacteristics();
	}

	@Override
	public void populateCharacteristics(List<String> characteristics)
	{
		characteristics.add("They have tail that stays attached");
	}

	//	@Override
//	public List<String> getCharacteristics()
//	{
//		List<String> characteristics = new ArrayList<>(AnimalSupport.getAmphibianCharacteristics());
//		characteristics.add("They have tail that stays attached");
//		return characteristics;
//	}
}
