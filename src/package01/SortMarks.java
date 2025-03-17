package package01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SortMarks {
public static void main(String[] args) {
	Map<String,Integer> originalMarks = new ConcurrentHashMap<String,Integer >();
	originalMarks.put("Maths", 95);
	originalMarks.put("Chemistry",92);
	originalMarks.put("Physics",99);
	originalMarks.put("English",0   );
	originalMarks.put("Hindi",85);
	Map<String,Integer> result = new LinkedHashMap<String,Integer >();
	List<Integer> marks=new ArrayList<Integer>();
	for(int p:originalMarks.values()) {
		marks.add(p);
			}
Collections.sort(marks);
for(int p:marks) {
	for(String z:originalMarks.keySet()) {
		if(originalMarks.get(z).equals(p)) {
			result.put(z, p);
		}
	}
}

System.out.println(result);
}
}
