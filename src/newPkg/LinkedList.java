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
	void arayaEkle(int index,int x) {
		Node eleman=new Node();
		eleman.data=x;
		if(head==null && index==0) {
			head=eleman;
			tail=eleman;
			System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
		}else if(head!=null && index==0) {
			eleman.next=head;
			head=eleman;
			System.out.println(index+" indisinci sıraya eleman eklendi");
		}
		else {
			int n=0;
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				n++;
				temp2=temp;
				temp=temp.next;
				
			}
			if(n==index ) {
				temp2.next=eleman;
				eleman.next=temp;
				
				System.out.println(index+" indisinci sıraya eleman eklendi");
			}else {
				temp=head;
				temp2=head;
				int i=0;
				while(i!=index) {
					temp2=temp;
					temp=temp.next;
					i++;
					
				}
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(index+" indisinci sıraya eleman eklendi");

			}
			
		}
	}
	void bastanSil() {
		if(head==null) {
			System.out.println("Liste boş silinecek eleman yok");
		}else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi");
		}else {
			head=head.next;
			System.out.println("Baştaki eleman silindi");
			
		}
	}
	void sondanSil() {
		if(head==null) {
			System.out.println("Liste boş silinecek eleman yok");
		}else if(head.next==null) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi");
		}else {
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			tail=temp2;
			System.out.println("Sondaki eleman silindi");
		}
	}
	void aradanSil(int index) {
		if(head==null) {
			System.out.println("Liste boş silinecek eleman yok");
		}else if(head.next==null && index==0) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi");
		}else if(head.next!=null && index==0) {
			head=head.next;
			System.out.println("Baştaki eleman silindi");
		}else {
			int n=0;
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				n++;
			}
			if(n==index) {
				temp2.next=null;
				tail=temp2;
			}else {
				temp=head;
				temp2=head;
				int j=0;
				while(j!=index) {
					temp2=temp;
					temp=temp.next;
					j++;
				}
				temp2.next=temp.next;
				System.out.println("Aradaki eleman silindi");
			}
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
