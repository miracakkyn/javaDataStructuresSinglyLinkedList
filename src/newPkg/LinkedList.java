package newPkg;

public class LinkedList {
	Node head;
	Node tail;
	
	void basaEkle(int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
		}else {
			eleman.next=head;
			head=eleman;
			System.out.println("Başa eleman eklendi");
		}
	}
	
	void sonaEkle(int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
		}else {
			tail.next=eleman;
			tail=eleman;
			System.out.println("Sona eleman eklendi");
		}
	}
	void yazdir() {
		if(head==null) {
			System.out.println("Liste boş yazdırılacak eleman yok");
		}else {
			Node temp=head;
			System.out.print("\nbas -> ");
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.println("son");
		}
	}
	
}
