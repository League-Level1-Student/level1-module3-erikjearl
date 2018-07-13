import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	
	public static void main(String[] args) {
		World world = new World();
		world.show();
		
		
		Location l1 = new Location(0, 0);
		Location l2 = new Location(4, 6);
		Location l21 = new Location(4, 4);
		Location l22 = new Location(4, 8);
		
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		b2.setColor(Color.blue);
		b2.turn();
		b2.turn();
		
		//world.add(l1,b1);
		//world.add(l2,b2);
		Flower f = new Flower();
		Flower r = new Flower();
		r.setColor(Color.red);
		f.setColor(Color.white);
		
		//world.add(l21, f);
		//world.add(l22, f);
		
		
		for (int i = 0; i < 10; i++) {
			
			for(int m = 0; m < 10; m++) {
			
				if (i== 0 ||i== 2 ||i== 4 ||i== 6 ||i== 8) {
					Location l = new Location(i,m);
					world.add(l,f);
				}
				else {
					Location l = new Location(i,m);
					world.add(l,r);
				}
			
			}
			
		}
		
	
		
			
	}
	
}
