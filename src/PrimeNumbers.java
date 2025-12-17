public class PrimeNumbers {
    public static void main(String[] args){
        for(int i = 2; i <= 10; i++){
            boolean flag = false;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Composite " + i);
            } else {
                System.out.println("Prime " + i);
            }
        }
    }
}
