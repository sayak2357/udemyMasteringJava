public class LL {
    private String val;
    public LL next;
    public LL prev;
    public LL(String value){
        this.val = value;
        this.next = null;
        this.prev = null;
    }
    public String getVal(){
        return this.val;
    }

}
