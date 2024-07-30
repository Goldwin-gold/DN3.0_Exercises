public class linked {
    Task head;
    Task tail;
    int length=0;

    private Task[] tasks;

    public linked(){
        tasks=new Task[100];
    }

    public void add(Task task){
        if(length==0){
            head=task;
            tail=task;
            length=1;
        }else{
            tail.next=task;
            tail=task;
            length++;
        }
    }

    public Task search(int tId){
        Task temp=head;
        while(temp!=null){
            if(temp.getTaskId()==tId){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void traverse(){
        Task temp=head;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }
    }

    public void delete(int tld){
        Task temp=head;
        Task prev=head;
        while(temp!=null){
            if(temp.getTaskId()==tld){
                prev.next=temp.next;
                temp.next=null;
                }
                prev=temp;
                temp=temp.next;
            }
        }
    }

