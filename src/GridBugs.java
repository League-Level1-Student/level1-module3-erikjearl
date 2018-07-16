import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridBugs {
	
	public static void main(String[] args) {
	 World world = new World();
	 world.show();
	 Bug b1 = new Bug();
		for (int i = 0; i <10; i++) {
			for (int j = 0; j<10; j++) {
				if (i == j) {
					Location l = new Location(i,j);
					world.add(l, b1);
				}
				if (i == -j+9) {
				Location l1 = new Location(i,j);
				world.add(l1, b1);
				}
			}
		}
	}
		
}
		

