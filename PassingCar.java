public class PassingCar {
    public int solution(int[] A) {
        int seenCars=0;
        int passingCars=0;
        for(int a:A){
            if(a==0){
                seenCars++;
            }
            else{
                passingCars+=seenCars;
            }
        }
        return passingCars>1000000000 ? -1 : passingCars;
    }
    public static void main(String[] args) {
        PassingCar passinCar = new PassingCar();
        System.out.println(passinCar.solution(new int[]{0,1,0,1,1}));
    }
}
