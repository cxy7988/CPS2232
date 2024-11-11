public class loop {
    public static void main(String[] args){
        int rate = 43;
        int frequency = 2;
        for(int i = 7; i>=1; i--){
            rate -=2;
            frequency = (rate*2)+1;
        }
    }
}
