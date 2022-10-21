package algorithm.week5.java1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket sb = new SolveBracket();

        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
        assertFalse(sb.solution("(()("));
        assertFalse( sb.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));

        assertTrue(sb.solution2("()()"));
        assertTrue(sb.solution2("(())()"));
        assertFalse(sb.solution2(")()("));
        assertFalse(sb.solution2("(()("));
        assertFalse( sb.solution2("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}