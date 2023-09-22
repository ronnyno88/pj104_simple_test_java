package Repository;

public class OrderThis {


    public void orderList(int list[]) {
        int lenght = list.length;
        for (int step = 1; step<lenght; step++){
            int key = list[step];
            int selected = step-1;
            while ((selected >= 0) && (list[selected] > key)){
                list[selected+1] = list[selected];
                selected--;
            }
            list[selected+1] = key;
        }
        showList(list);
    }

    public void showList(int list[]){
        for (int i:list){
            System.out.println(i);
        }
    }
}
