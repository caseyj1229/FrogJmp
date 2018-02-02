//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJmp {
    public static int solution(int X, int Y, int D){
        //Assume X is always less than Y
        X = Y-X;
        Y = (int) Math.ceil((double)X/(double)D);

        return Y;
    }
}