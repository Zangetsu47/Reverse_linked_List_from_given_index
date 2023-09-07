/*
class Node{
  int data;
  int next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class ListNode{
 ListNode head;
 ListnNode()
 {
   head=null;
 }
}
*/
void remove(int start,int end)
{
  Node current=head;
  if(head==null)
    return;
  int i=1;
  List<Integer>list=new LinkedList<>();
  while(current!=null)
    {
      if(i>=start && i<=end)
      {
        list.add(0,current.data);
      }
      i++;
      current=current.next;
    }
  current=head;
  i=1;int k=0;
  while(current!=null)
    {
      if(i>=start && i<=end)
        current.data=list.get(k++);
      i++;
      current=current.next;
    }
}
