package i_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection_StackQueue {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("0");//st.add()도 가능
		st.push("1");
		st.push("2");
		
		System.out.println("--------------Stack------------");
		while(!st.empty()){
			System.out.println(st.pop());
		}//꺼낼 때 최근순으로
		
		Queue<String> q = new LinkedList<String>();//이걸 하나로 봐 사용시 그대로 사용
		q.offer("0");
		q.offer("1");
		q.offer("2");
		System.out.println("-------------Queue-------------");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
