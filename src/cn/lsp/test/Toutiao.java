package cn.lsp.test;

import java.util.Scanner;

public class Toutiao {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Node [] nodes=new Node[n];
		for(int i=0;i<n;i++) {
			nodes[i]=new Node();
		}
		for(int i=0;i<n;i++) {
			int j=scanner.nextInt();
			if(j==0) {
				nodes[i]=new Node(j);
			}else {
				Node tmp=nodes[i];
				while(j!=0) {
					Node cur=new Node(j);
					tmp.next=cur;
					cur.next=tmp;
					j=scanner.nextInt();
				}
				Node last=new Node(j);
				tmp.next=last;
				last.next=null;
			}
		}
	System.out.println(nodes[0]);
	}
}
class Node{
	int index;
	Node next;
	public Node(int index) {
		this.index=index;
	}
	public Node() {
		
	}
}
