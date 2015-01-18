 import java.util.Arrays;
 import java.util.Comparator;
 import java.lang.Object;
 
public class HelloWorld{
    public class bn_comp implements Comparator<Integer> {
	    
	    @Override
	    public int compare(Integer a, Integer b) {
	        int bnA= binCardinality(a);
	        int bnB= binCardinality(b);
	        
	        if(bnA!=bnB)
	            return (bnA-bnB);
	        else
	            return (a.intValue()-b.intValue());
	    }
	    
	    private int binCardinality(Integer a) {
	        int ans=0;
	        while(a!=0) {
	            ans++;
	            a&=(a-1);
	        }
	        return ans;
	    }
	}
	
	int[] arrange(int[] numbers) {
	    
	    Integer[] num = new Integer[numbers.length];
	    for(int i=0; i<numbers.length; ++i) 
	        num[i] = numbers[i];
	        
	    System.out.println("copied");
	    
	    Arrays.sort(num, new bn_comp());
	    
	    for(int i=0; i<numbers.length; ++i) 
	        System.out.println(num[i]);
	        
	    return numbers;
	}
	
     public static void main(String []args){
        HelloWorld obj = new HelloWorld();
        int[] ele = {811385,340578,980086,545001,774872,855585,13848,863414,419523,190151,784903,127461};
        System.out.println("Answer = "+ obj.arrange(ele));
     }
}
