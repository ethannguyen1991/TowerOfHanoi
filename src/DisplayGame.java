import java.util.Scanner;

public class DisplayGame 
{
	private Tower[] Towers;
	private Scanner input;
	public DisplayGame(int numDisk, int numTowers)
	{
		Towers = new Tower[numTowers];
		input = new Scanner(System.in);
		for(int i = 0; i < this.Towers.length; i++)
		{
			Towers[i] = new Tower("Tower" + i);

		}
		for(int i = numDisk; i > 0; i--)
		{
			Towers[0].push(new Disk(i));
		}
	}
	public void Move(int source, int destination)
	{
		Disk temp = Towers[source].peek();
		Disk topOfDestTower =  Towers[destination].peek();
		if (topOfDestTower == null || topOfDestTower.getSize() > temp.getSize())
		{
			Towers[destination].push(temp);
		}

	}
	public void display()
	{
		for(Tower tower : this.Towers)
		{
			tower.display();

		}
		this.checkWinner();
		System.out.println("where do you want to place your Souce: ");
		int theSource = Integer.parseInt(this.input.nextLine());
		System.out.println("Where do you want to place your destiantion: ");
		int theDestination = Integer.parseInt(this.input.nextLine());
		this.Move(theSource, theDestination);
	}
	public void checkWinner()
	{
		for (int i = 0; i < Towers.length-1; i++)
		{
			if(Towers[i].peek() !=null)
			{
				return;
			}
		}
		System.out.println("Congratulation You Are Winner!!!!");
		System.exit(0);
	}

}
