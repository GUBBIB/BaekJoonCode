import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s;

        for(int i=0; i<n; i++){
            s = br.readLine();
            if(s.startsWith("1")){
                int x = Integer.parseInt(s.split(" ")[1]);
                MyStack.push(x);
            }

            switch (s) {
                case "2":
                    sb.append(MyStack.pop()).append("\n");
                    break;

                case "3":
                    sb.append(MyStack.count()).append("\n");
                    break;

                case "4":
                    sb.append(MyStack.empty()).append("\n");
                    break;

                case "5":
                    sb.append(MyStack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static class MyStack {
        static private int size = 10, t_p = 0;
        static private int[] stack = new int[size];

        public static void resize(){
            int[] tmp = new int[size*2];
            for(int i=0; i<stack.length; i++){
                tmp[i] = stack[i];
            }
            stack = tmp;
            size *= 2;

        }
        public static void push(int x){
            if(t_p == size) resize();
            stack[t_p++] = x;
        }

        public static int pop(){
            if(t_p == 0) return -1;
            int tmp = stack[t_p-1];
            t_p--;
            return tmp;
        }

        public static int count(){
            return t_p;
        }

        public static int empty(){
            return (t_p == 0)? 1 : 0;
        }

        public static int peek(){
            if(t_p == 0) return -1;
            return stack[t_p-1];
        }

    }
}