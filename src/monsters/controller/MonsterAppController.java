package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Havel", 2.5, 3.0, 2, 4, 1, false);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
}
