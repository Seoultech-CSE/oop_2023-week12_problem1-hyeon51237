import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i = 0; i < 5; i++){
            int num = input.nextInt();
            list.add(num);
        }
        for(int i = 0; i < 5; i++){
            double num_double = input.nextDouble();
            list.add(num_double);
        }
        sort(list);
        for(int i = 0; i < list.size(); i++){
        Number temp = list.get(i);
        System.out.print(temp + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                double a = list.get(i).doubleValue();
                double b = list.get(j).doubleValue();
                Number t = list.get(i);
                if(a > b){
                list.set(i, list.get(j));
                list.set(j, t);
                }
            }
    }
    }
}
