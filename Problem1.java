import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
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
        System.out.print(list);
       
    }

    public static void sort(ArrayList<Number> list) {
        for(int i = 0; i < list.size() - 1; i++){
            int temp = i;
            for(int j = 1; j < list.size(); j++){
                double a = list.get(temp).doubleValue();
                double b = list.get(j).doubleValue();
                if(a >= b){
                    temp = j;
                }
                list.set(i, a);
                list.set(temp, b);
                
            }
    }
    }
}
