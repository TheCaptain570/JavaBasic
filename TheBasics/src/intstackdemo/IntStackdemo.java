package intstackdemo;

public class IntStackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int data[] = {8,7,9,6,3};
		Stack stack = new Stack(10);
		stack.push(8);
		stack.push(7);
		stack.push(9);
		stack.push(6);
		stack.push(3);
		stack.pop();
		stack.push(5);
		stack.push(5);
		stack.pop();
		stack.push(0);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(6);
		while( stack.peek() != -1){
			System.out.println("Final Stack : " +stack.pop());
		}
		/*for(int i =0; i < 10; i++){

			//stack.push(data[i]);
			System.out.println(stack.pop() + " :");
		}
		System.out.println(" \n\n");*/
	}

}
