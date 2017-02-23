
public class Disk
{

	private int size;
	private Disk nextDisk;

public Disk(int size)
{
	this.size = size;
	this.nextDisk = null;
    }

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public Disk getNextDisk() {
	return nextDisk;
}

public void setNextDisk(Disk nextDisk) {
	this.nextDisk = nextDisk;
}

public void display()
{
	for(int i = 0; i< this.size; i++)
	{
		System.out.print("=");
	}
	System.out.println("");
}
}
