import java.util.Scanner;

public class Homework3 {
    int input, min, max;
    int[] arr;
    void intArr(){
        this.arr = new int[this.input];
    }
    void setMax(){
        this.max = this.arr[0];

        for(int i=0; i<input; i++){
            if(this.arr[i]>this.max)
                this.max = this.arr[i];
        }
    }
    void setMin() {
        this.min = this.arr[0];

        for (int i = 0; i < input; i++) {
            if (this.arr[i] < this.min)
                this.min = this.arr[i];
        }
    }

    public static void main(String[] args){
        Homework3 sort = new Homework3();
        System.out.printf("몇 개의 수를 입력할 예정인가요?");
        Scanner sc = new Scanner(System.in);
        sort.input = sc.nextInt();
        sort.intArr();
        System.out.print("수를 입력하세요: ");
        for(int i=0; i<sort.input; i++){
            sort.arr[i] = sc.nextInt();
        }
        sort.setMax();
        sort.setMin();
        System.out.println("최댓값: "+sort.max+" 최솟값: "+sort.min);
        sc.close();

    }
}
