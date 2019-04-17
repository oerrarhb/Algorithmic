package classes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.*;


public class PowerOfStreams {

	public PowerOfStreams() {
		
	}
	
	public List<Point> positiveXPointsFilter(Point[] tab_points)
	{
		return  Stream.of(tab_points).filter(p -> p.getX()>0).collect(Collectors.toList());	
	}
	
	public List<Point> streamOFPointCreation(Integer[] tab)
	{
		return  Stream.of(tab).map(i -> new Point(i, 2*i)).collect(Collectors.toList());
	}
	
	
	public String stickStrings(String[] str_tab)
	{
		return Stream.of(str_tab).filter(str -> str.length()>4).collect(Collectors.joining(" | "));
		
	}
	
	
	public Map<String, List<String>> organizeStreams(String[] str_tab)
	{
		return Stream.of(str_tab).collect(Collectors.groupingBy(str -> str.substring(0,1)));
	}
	
	
	public Map<Integer, Integer> calculateOccurences(Integer[] tab)
	{
		Map<Integer, Integer> M = new TreeMap<Integer, Integer>();
		for(Integer i : tab)
		{
			Integer count = M.get(i);
			if(count == null) 
			{
				count = 1;
				M.put(i, count);
			}
			else
			{
				++count;
				M.put(i, count);
			}
		}
		return M;
	}
	

}
