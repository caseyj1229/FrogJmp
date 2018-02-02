import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {
    @Test
    void solution() {
        int X = 10;
        int Y = 85;
        int D = 30;
        assertEquals(3,FrogJmp.solution(X,Y,D));

        assertEquals(7,FrogJmp.solution(1,8,1));

        assertEquals(1,FrogJmp.solution(1,2,100));

        assertEquals(10000,FrogJmp.solution(1,10001,1));
    }
}