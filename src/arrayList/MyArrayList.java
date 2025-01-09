package arrayList;

public class MyArrayList {
    int [] data;
    int end;

    public MyArrayList(){
        data = new int[10];
        end =-1;
    }
    public MyArrayList(int cap){
        data = new int[cap];
        end =-1;
    }

    // operations
    // add
    // add (insert)

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= end; i++) {
            sb.append(data[i]);
            if(i != end){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
