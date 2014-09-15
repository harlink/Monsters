package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "Wow a Popup!!");
		JOptionPane.showMessageDialog(null, "I made a monster, its name is: "+ baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null,baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arms");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " Has " + baseController.getMyMonster().getAmountOfHair() + " hair");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " Has " + baseController.getMyMonster().getEyeCount() + " eyes" );
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " Has " + baseController.getMyMonster().getNoseCount() + " nose");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " Has " + baseController.getMyMonster().getNumberOfLegs() + " legs");

	}
	
}
