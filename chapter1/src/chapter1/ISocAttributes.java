package chapter1;

import java.util.Collections;
import java.util.List;

import com.att.opus.models.Soc;

public interface ISocAttributes {

	default List<Soc> sortByAlphabeticalOrder(List<Soc> socss){
		Collections.sort((List<Soc>) socss);
		return socss;
	}
	
}
