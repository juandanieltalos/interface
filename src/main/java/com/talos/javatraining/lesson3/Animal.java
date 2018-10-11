package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.impl.animals.Human;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public interface Animal
{
	String PACKAGE = Human.class.getPackage().getName() + ".";

	default String getName()
	{
		return getClass().getSimpleName();
	}

	List<String> getCharacteristics();

	default String getFullDescription(){
		StringBuilder builder = new StringBuilder();
		String name = getName();
		String lastChr = name.substring(name.length()-1);
		builder.append(name).append(lastChr.equals("s") ? "es" : "s").append(" have these characteristics :");
		for (String characteristic : getCharacteristics())
		{
			builder.append(StringUtils.LF).append(StringUtils.CR).append("- ").append(characteristic);
		}
		return builder.toString();
	}

	static Animal create(String name) {
		//Class<?> animal = Animal.class.getClassLoader().loadClass(name);
		//if (name.equals(null)){return null;}
		Class c = null;
		Animal animal = null;
		try
		{
			c = Class.forName(PACKAGE + name);
			animal = (Animal) c.newInstance();

		}
		catch (ClassNotFoundException e)
		{
			return null;
		}
		catch (InstantiationException e)
		{
			return null;
		}
		catch (IllegalAccessException e)
		{
			return null;
		}
		finally
		{
			return animal;
		}

	}

}
