import java.util.Arrays;

public class Program {
	
	public static int priority(String i) {
		switch (i) {
		case "$": return 10;
		case "*": return 9;
		case "/": return 9;
		case "%": return 9;
		case "+": return 8;
		case "-": return 8;
		}
		return 0;
	}
	
	public static String infixToPrefix(String infix) {
		Stack st = new Stack(15);
		String arr[] = infix.split(" ");
		//System.out.println(Arrays.toString(arr));
		StringBuilder prefix = new StringBuilder();
		for(int i =arr.length-1; i >=0  ;i--) {
			int flag =0;
			for(int j =0 ; j<arr[i].length() ;j++)
					if(Character.isDigit(arr[i].charAt(j)))
						flag=1;
			
			//char ele = infix.charAt(i);
			
			if(flag==1) 
				prefix.append(arr[i]+ " ");
			else if(arr[i].equals(")") )
				st.push(arr[i]);
			else if(arr[i].equals("(") ) {
				while(!st.peek().equals(")"))
					prefix.append(st.pop()+ " ");
				st.pop();
				
			}
			else {
				while(!st.isEmpty() && priority(st.peek())>priority(arr[i])) {
					prefix.append(st.pop()+ " ");
				}
				st.push(arr[i]);
			}
		}
		while(!st.isEmpty()) {
			prefix.append(st.pop());
		}
		return prefix.reverse().toString();
		
	}	
	public static String infixToPostfix(String infix) {
		Stack st = new Stack(15);
		String arr[] = infix.split(" ");
		//System.out.println(Arrays.toString(arr));
		StringBuilder postfix = new StringBuilder();
		for(int i =0; i < arr.length;i++) {
			int flag =0;
			for(int j =0 ; j<arr[i].length() ;j++)
					if(Character.isDigit(arr[i].charAt(j)))
						flag=1;
			
			//char ele = infix.charAt(i);
			
			if(flag==1) 
				postfix.append(arr[i]+ " ");
			else if(arr[i].equals("(") )
				st.push(arr[i]);
			else if(arr[i].equals(")") ) {
				while(!st.peek().equals("("))
					postfix.append(st.pop()+ " ");
				st.pop();
				
			}
			else {
				while(!st.isEmpty() && priority(st.peek())>=priority(arr[i])) {
					postfix.append(st.pop()+ " ");
				}
				st.push(arr[i]);
			}
		}
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		return postfix.toString();
		
	}

	public static void main(String[] args) {
		String infix = "1 $ 9 + 12 * 11 - ( 16 + 18 / 9 ) + 17";
		String postfix = infixToPostfix(infix);
		System.out.println("postfix : "+ postfix);
		String prefix = infixToPrefix(infix);
		System.out.println("prefix : "+ prefix);
	}

}
