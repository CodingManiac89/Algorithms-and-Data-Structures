package ds;

import java.util.LinkedList;







/**#################################################################################
#
#           			CYIENT LIMITED
#
#           Product: Map Feedback Portal
#
#           Copyright (c) 2014 CYIENT, all rights reserved.
#
#--------------------------------------------------------------------------------
#
# Name of the object : LinkedListImpl.java
# Creation Date      : Sep 2, 2014
# Creator Name       : Siddarth C.S
# Version No.        : 
#
# Major changes
# =============
# Date          Name               Change description
# 
#
#################################################################################
#*/

/**
 * 
 * @author Siddartha C.S
 *
 * 
 */
public class LinkedListImpl<Type extends Comparable<Type>> 
{
	private Node node;
	private int counter;  

	private class Node
	{
		private Type data;
		private Node link;

		Node(Type data, Node link) {
			this.data = data;
			this.link = link;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [data=" + data + ", link=" + link + "]";
		}



	}

	public void add(Type data)
	{
		Node temp=getNode();

		if(temp==null)
		{
			temp=new Node(data,null);
			setNode(temp);

		}
		else
		{
			Node temp2 = temp;

			while(temp2.link!=null)
				temp2=temp2.link;

			temp2.link = new Node(data,null);



		}
		counter++;


	}
	
	
	public void addFirst(Type ele){
		Node temp = getNode();
		Node temp2=null;
		if(temp==null){
			add(ele);
		}
		else{
			temp2 = new Node(ele,null);
			temp2.link=temp;
			setNode(temp2);
		}
	}
	
	public boolean isEmpty(){
		Node temp = getNode();
		return temp==null;
	}

	public Type getElementAtIndex(int index)
	{
		int counter=1;
		Type t=null;
		Node temp = getNode();
		while(temp.link!=null)
		{
			if(counter==index)
			{
				t=temp.data;
			}
			counter++;
			temp=temp.link;
		}
		return t;
	}

	public Type pop()
	{
		Type ele=null;
		Node temp=getNode();

		ele=temp.data;
		Node cur=temp.link;
		temp.link=null;
		temp=cur;
		counter--;
		setNode(temp);

		return ele;
	}



	public void displayLinkedList()
	{
		Node temp=node;
		if(temp==null)
		{
			System.out.println("Empty List");
		}

		else
		{
			System.out.println(temp);
		}
	}

	public void returnCount(Type t)
	{
		int count=0;
		Node temp = node;
		if(temp==null)
		{
			System.out.println("No Data");
			return;
		}

		while(temp!=null)
		{
			if(temp.data.equals(t))
			{
				count++;
			}

			temp=temp.link;
		}

		System.out.println("The data found "+count+" times");
	}

	public void clear()
	{
		Node temp=getNode();
		while(temp!=null)
		{
			Node current = temp;
			temp=temp.link;
			current.link=null;
			counter--;
		}
		setNode(null);
	}
	
	



	public void deleteFromLinkedList(int index) 
	{
		int cnt=1;
		Node temp = getNode();

		if(index > counter)
		{
			throw new IndexOutOfBoundsException("There is no such element");
		}

		while(temp!=null)
		{
			if(index==1)
			{
				pop();
				break;
			}
			else if(cnt==index-1)
			{
				Node prev=temp;

				Node next = temp.link.link;		
				prev.link=next;
				counter--;
			}
			temp=temp.link;
			cnt++;
		}
	}

	public void add(int index, Type data)
	{
		Node temp=getNode();
		int cnt=1;
		while(temp!=null)
		{
			if(cnt==index-1)
			{
				Node prev =temp;
				prev.link=new Node(data,prev.link);
				counter++;
			}
			temp=temp.link;
			cnt++;
		}
	}

	public void reverse()
	{
		Node temp=getNode();
		Node header=temp;
		Node first=header;
		Node second=temp.link;
		Node third=temp.link.link;
		first.link=null;
		while(third!=null)
		{
			second.link=first;
			first=second;
			second=third;
			third=third.link;
		}
		second.link=first;
		header=second;
		setNode(header);
	}

	public Node reverse(Node sublist)
	{
		Node temp=sublist;
		Node header=temp;
		Node first=header;
		Node second=temp.link;
		Node third=temp.link.link;
		first.link=null;
		while(third!=null)
		{
			second.link=first;
			first=second;
			second=third;
			third=third.link;
		}
		second.link=first;
		header=second;
		return header;
	}

	public void sort()
	{
		Node temp = getNode();
		Node temp2=getNode();
		boolean flag=true;
		while(flag)
		{
			flag=false;
			temp=getNode();
			while(temp.link!=null)
			{
				Node cur=temp;
				Node next=temp.link;
				if(cur.data.compareTo(next.data)>0)
				{
					Type test=cur.data;
					cur.data=next.data;
					next.data=test;
					flag=true;
				}
				temp=temp.link;
			}

		}
		setNode(temp2);
	}

	public void appendLists(LinkedListImpl<Type> appendList)
	{
		Node header = getNode();

		if(header==null)
		{
			System.out.println("Cannot Append");
			return;
		}
		while(header.link!=null)
			header=header.link;

		header.link=appendList.getNode();

	}

	public void splitLists(LinkedListImpl<Type> firstList, LinkedListImpl<Type> secondList)
	{
		int split = Math.round((float)counter/2);
		Node header = getNode();
		Node first = header;
		Node second=null;
		int cnt=1;
		while(first!=null)
		{
			if(cnt==split)
			{
				second = first.link;
				first.link=null;
				break;
			}

			first=first.link;
			cnt++;
		}
		firstList.setNode(header);
		secondList.setNode(second);

	}

	public void removeDuplicates()
	{
		sort();
		Node header = getNode();
		int cnt=1;
		while(header.link!=null)
		{
			if(header.data.equals(header.link.data))
			{
				deleteFromLinkedList(cnt);

				header = getNode();
				cnt=1;
			}
			else
			{
				header=header.link;
				cnt++;

			}

		}
	}
	
	public void swapNodes(int source,int target){
		Node header = getNode();
		int counter = 1;
		Node srcBfr=null;
		Node srcAftr=null;
		Node trgtBfr = null;
		Node trgtAftr=null;
		Node src = null;
		Node trgt = null;
		while(counter<=target){
			if(counter == source-1){
				srcBfr = header;
			}
			else if(counter==target-1){
				trgtBfr = header;
				
			}
			header=header.link;
			counter++;
		}
		
		src = srcBfr.link;
		trgt = trgtBfr.link;
		
		
		
		srcAftr = srcBfr.link.link;
		trgtAftr = trgtBfr.link.link;
		
		src.link=trgtAftr;
		trgt.link=srcBfr;
		
		srcBfr.link = trgt;
		trgtBfr.link = src;
		srcBfr.link.link = trgtBfr;
		
	/*	srcBfr.link.link = trgtBfr.link.link;
		trgtBfr.link.link = srcBfr.link.link;*/
		
		
		
		
		
		
	}

	public void moveNodeFrmSecondToFirst(LinkedListImpl<Type> dest, LinkedListImpl<Type> source)
	{
		Node secondNode = source.getNode();
		Node secondHeader = secondNode;
		secondHeader = secondNode.link;
		secondNode.link=dest.getNode();
		dest.setNode(secondNode);
		source.setNode(secondHeader);
	}

	public void alternatingSplit(LinkedListImpl<Type> evenList, LinkedListImpl<Type> oddList)
	{
		Node header = getNode();
		Node first = header;
		Node second = header.link;
		
		Node finalFirst = header;
		Node finalSecond=header.link;
		
		while(first!=null && second!=null)
		{
			if(first.link!=null)
			first.link = first.link.link;
			
			if(second.link!=null)
			second.link = second.link.link;
			
			first=first.link;
			second=second.link;
		}
		evenList.setNode(finalSecond);
		oddList.setNode(finalFirst);
	}
	
	public void shuffleMerge(LinkedListImpl<Type> sourceList)
	{
		Node header=getNode();
		Node srcPtr=sourceList.getNode();
		int cnt=1;
		while(header!=null && srcPtr!=null)
		{
			Node srcHeader = srcPtr;
			Node tempDest = header.link;
			Node destHeader=header;
			
			if(cnt % 2 == 1)
			{
				srcPtr=srcHeader.link;
				destHeader.link=srcHeader;
				srcHeader.link=tempDest;
			}
			
			
			header=header.link;
			cnt++;
			//System.out.println(srcPtr);
		}
		
				
	}

	public int size()
	{
		return counter;
	}

	/**
	 * @return the node
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNode(Node node) {
		this.node = node;
	}


	public Type peek() {
		return getNode().data;
	}


}




