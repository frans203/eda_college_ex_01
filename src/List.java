import java.util.Arrays;

public class List {
    private final int[] data;
    private int size;
    private final int capacity;

    public List(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public List() {
        this.data = new int[10];
        this.size = 0;
        this.capacity = 10;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        if(size == capacity){
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    public int getElement(int pos){
        int item;
        if(pos > size || pos <=0){
            return -1;
        }else{
            item = data[pos-1];
            return item;
        }
    }

    public int getPosition(int item){
        for(int i=0;i<size;i++){
            if(data[i] == item){
                return (i+1);
            }
        }
        return -1;
    }

    public int add(int item){

        data[0] = item;
        return item;
    }

    public boolean insert (int pos, int item){
        if(isFull() || (pos > size + 1) || (pos <=0)){
            return false;
        }

        for(int i=size;i>=pos;i--){
            data[i] = data[i-1];
        }
        data[pos - 1] = item;
        size++;
        return true;
    }
    public int replace (int pos, int item){
        if(isFull() || (pos > size + 1) || (pos <=0)){
            return -1;
        }
        data[pos - 1] = item;
        return data[pos-1];
    }

    public int remove(int pos){
        int item;
        if(pos > size || pos < 1){
            return -1;
        }
        item = data[pos - 1];
        for(int i = pos - 1;i < size - 1; i++){
            data[i] = data[i+1];
        }
        data[size-1]=0;
        size--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
