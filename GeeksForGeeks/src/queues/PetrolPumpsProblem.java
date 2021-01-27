package queues;

import ds.LinkedListImpl;
import ds.QueueUsingLinkedList;

public class PetrolPumpsProblem {
	QueueUsingLinkedList<PetrolPump> q;
	
	private class PetrolPump implements Comparable<PetrolPump>{
		private int petrol;
		private int distanceToNextPump;
		public PetrolPump(int petrol, int distanceToNextPump) {
			this.petrol = petrol;
			this.distanceToNextPump = distanceToNextPump;
		}
		@Override
		public int compareTo(PetrolPump o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public PetrolPumpsProblem() {
		q = new QueueUsingLinkedList<>();
		q.insert(new PetrolPump(6,4));
		q.insert(new PetrolPump(3,6));
		q.insert(new PetrolPump(7,3));
	}
	
	public PetrolPump getEffectivePump(){
		PetrolPump firstPump = q.peek();
		int curPetrol = firstPump.petrol - firstPump.distanceToNextPump;
	}
	
}


