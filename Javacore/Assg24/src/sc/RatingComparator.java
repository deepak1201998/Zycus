package sc;

import java.util.Comparator;


	public class RatingComparator implements Comparator<Customer>{
		public int compare(Customer e1 ,Customer e2) {
			return  (int)( e1.rating - e2.rating);
	}

	}
