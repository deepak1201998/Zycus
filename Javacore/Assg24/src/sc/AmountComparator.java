package sc;

import java.util.Comparator;

public class AmountComparator implements Comparator<Customer>{
	public int compare(Customer e1 ,Customer e2) {
		return  (int)( e1.averageSpendAmount - e2.averageSpendAmount);
}

}