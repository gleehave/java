package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
‘()’ 인 괄호열의 값은 2이다.
‘[]’ 인 괄호열의 값은 3이다.
‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.
올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.

(()[[]])([])
28
 */
public class boj_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Stack<Character> st = new Stack<Character>();

        boolean flag = true;
        int answer = 0;
        int cnt = 1;

        for (int i = 0; i < line.length(); i++) {
            char current = line.charAt(i);
            if (current == '(') {
                st.push(current);
                cnt *= 2;
            } else if (current == '[') {
                st.push(current);
                cnt *= 3;
            } else {
                if (current == ')') {
                    if (st.isEmpty() || st.peek() != '(') {
                        flag=false;
                        break;
                    }
                    if (line.charAt(i - 1) == '(') {
                        answer += cnt;
                    }
                    st.pop();
                    cnt /= 2;
                } else if (current == ']') {
                    if (st.isEmpty() || st.peek() != '[') {
                        flag = false;
                        break;
                    }
                    if (line.charAt(i - 1) == '[') {
                        answer += cnt;
                    }
                    st.pop();
                    cnt /= 3;
                } else {
                    flag=false;
                    break;
                }
            }
        }
        if (!flag || !st.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
