package com.tnsif.dayseven.overridingdemo;

public class RBI {

	
	
	public float getRateofInterest()
	{
		return 7.0f;
	}
}

class Axis extends RBI
{
	public float getRateofInterest()
	{
		return 6.6f;
	}
}

class ICICI extends RBI
{
	public float getRateofInterest()
	{
		return 5.6f;
	}
}

class HDFC extends RBI
{
	public float getRateofInterest()
	{
		return 7.6f;
	}
}
