import java.util.ArrayList;
import java.util.List;


public class ForEachLoop {
public static void main(String[] args) {
	List<String> al = new ArrayList<String>();
	al.add("Cat");
	al.add("Dog");
	al.add("Sravs");
	for(String data : al){
		System.out.println("Data by using Enhanced Forloop:"+data);
	}
}
}
