package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.BonyFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Salmon extends AbstractAnimal implements BonyFish
{
	@Override
	public List<String> getParentCharacteristics()
	{
		return BonyFish.super.getCharacteristics();
	}

	@Override
	public void populateCharacteristics(List<String> characteristics)
	{
		characteristics.add("They are anadromous fish");
	}


	//	@Override
//	public List<String> getCharacteristics()
//	{
//		List<String> characteristics = new ArrayList<>(AnimalSupport.getFishCharacteristics());
//		characteristics.addAll(AnimalSupport.getBonyFishCharacteristics());
//		characteristics.add("They are anadromous fish");
//		return characteristics;
//	}
}
