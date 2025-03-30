public class Fila{


    Node head;
    Node tail;
    int quantidade; 
    int tamanho;

    public Fila(int tamanho){

        this.tamanho = tamanho;
        quantidade =0;
    }

    public void add(int data){

        if (quantidade< tamanho) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
                quantidade++;
                return;
                
            }else{
                tail.next = newNode;
                newNode = tail;
                quantidade++;
                return;
            }
        }else{
            System.out.println("A fila atingiu limite maximo: ");
        }
    }

    public void remove(){
        if (head == null) {
            System.out.println("A Fila esta vazia");
            
        }if (head == tail) {
            head =null;
            tail = null;
            quantidade--;
            return;
        }else{
            Node temp = head.next;
            head.next.prev = null;
            head.next = null;
            head = temp;
            quantidade--;
        }
    }


    public int peek(){
        if (head == null) {
            System.out.println("A fila esta vazia:");
            return 0;
        }else{
            return head.data;
        }
    }

    public boolean isEmpty(){
        if (head ==null) {
            return  true;            
            
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (tamanho<quantidade) {
            return true;
            
        }else{
            return false;
        }
    }

}