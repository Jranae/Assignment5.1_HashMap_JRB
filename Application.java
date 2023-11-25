import java.util.*;

public class Application {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dictionary obj = new Dictionary();
		obj.loadRecords();
		System.out.println(obj.findWord("run"));
		obj.saveRecords();
}
}

