
public class Tower 
{
	private Disk top;
	private String name;
public Tower(String name)
{
	this.top = null;
	this.name = name;
}
public void push(Disk disk)
{
	disk.setNextDisk(top);
	this.top = disk;
}
public Disk pop()
{
	if(top == null)
	{
		return null;
	}
	Disk diskToReturn = top;
	top = top.getNextDisk();
	return diskToReturn;
}
public Disk peek()
{
	return top;
}
public void display()
{
	Disk currDisk = this.top;
	if(currDisk != null)
	{
		currDisk.display();
		currDisk = currDisk.getNextDisk();
	}
	System.out.println("________________");
	System.out.println(this.name);
	System.out.println("\n\n");
}
}
