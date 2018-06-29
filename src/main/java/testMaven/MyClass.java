package testMaven;

public class MyClass {

	public void print(int num){
		if (num <= 0) {
			System.out.println("输入数组有误");
			return;
		}
		
		for (int i = 1; i <= num; i++) {
			String result=this.printNum(i);
			System.out.println(result);
			
		}
	}
	public String printNum(int num){
		boolean multiplesThree=(num%3==0);
		boolean multiplesFive=(num%5==0);
		
		String result="";
		if (multiplesThree && multiplesFive) {
			result="FizzBuzz";
		}
		else if(multiplesThree){
			result="Fizz";
		}
		else if(multiplesFive){
			result="Buzz";
		}
		else{
			result=String.valueOf(num);
		}
		return result;
	}
	
	
	public boolean testQuestion(int descNum){
		if (descNum<=0 || descNum>9) {
			System.out.println("输入descNum有误");
			return false;
		}
		
		boolean result=true;
		for (int i = 1; i <= 100; i++) {
			if(i%descNum==0 || String.valueOf(i).indexOf(String.valueOf(descNum))>-1){
				result = result && 
						this.printNum(i).equals("Fizz");
				if (!result) {
					return false;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int i=235;
		System.out.println(String.valueOf(i).indexOf("2")>-1);
	}
}
