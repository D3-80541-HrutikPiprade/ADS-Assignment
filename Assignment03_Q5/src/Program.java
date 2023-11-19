
public class Program {
	public static int calculate(int a,int b,String ele) {
		switch (ele) {
		case "+": return a+b;
		case "-": return a-b;
		case "*": return a*b;
		case "/": return a/b;
		case "$": return (int)Math.pow(a, b);
		}
		return 0;
	}
	
	public static int postfixMulti(String postfix) {
		Stack st = new Stack(10);
		String arr[] = postfix.split(" ");
		
		for(int i =0; i<arr.length;i++) {
			int flag=0;
			for(int j =0; j<arr[i].length();j++) {
				if(!Character.isDigit(arr[i].charAt(j)))
					flag=1;
			}
			if(flag==0)
				st.push(Integer.parseInt(arr[i]));
			else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1,op2,arr[i]);
				st.push(res);
			}	
		}
		if(!st.isEmpty())
			return st.pop();
		return 0;
	}
	
	public static int prefixMulti(String prefix) {
		Stack st = new Stack(10);
		String arr[] = prefix.split(" ");
		
		for(int i =arr.length-1; i>=0;i--) {
			int flag=0;
			for(int j =0; j<arr[i].length();j++) {
				if(!Character.isDigit(arr[i].charAt(j)))
					flag=1;
			}
			if(flag==0)
				st.push(Integer.parseInt(arr[i]));
			else {
				int op1 = st.pop();
				int op2 = st.pop();
				int res = calculate(op1,op2,arr[i]);
				st.push(res);
			}	
		}
		if(!st.isEmpty())
			return st.pop();
		return 0;
	}
	
	

	public static void main(String[] args) {
		String postfix = "4 5 6 * 15 / + 9 + 11 -";
		
		int result = postfixMulti(postfix);
		System.out.println("Result of postfix :"+result);
		
		String prefix = "- + + 4 / * 5 6 15 9 11";
		int res = prefixMulti(prefix);
		System.out.println("Result of prefix: "+res);
	
	}

}
