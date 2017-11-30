package intstackdemo;

public class Stack implements IntStack{
private int data[];
private int top;
private int size;
private int items;

public Stack(int size){
	data = new int[size];
	this.size = size;
	items = 0;
	top = -1;
}
public boolean push(int item){
	boolean res = false;
	if(items < size){
		top ++;
		data[top] = item;
		items++;
		res = true;
	}
	return res;
}
public int pop(){
	int res = -1;
	if(items > 0){
		res = data[top];
		items--;
		top--;
	}
	return res;
}
public int peek(){
	int res = -1;
	if(items > 0){
		res = data[top];
	}
	return res;
}
}
