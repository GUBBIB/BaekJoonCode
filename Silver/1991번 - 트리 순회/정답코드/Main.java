import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int start = 0, index = 0;
        // 0 : left, 1 : right
        int[] leftRight = new int[2];
        ArrayList<ArrayList<Integer>> node = new ArrayList<>();

        for(int i=0; i<n+1; i++){
            node.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            start = st.nextToken().charAt(0) - 'A';

            for(int j=0; j<2; j++){
                String tmp = st.nextToken();
                leftRight[j] = (checkEmpty(tmp))? tmp.charAt(0) - 'A' : -1;
                node.get(start).add(leftRight[j]);
            }
        }

        preorder(node, 0);
        System.out.println();

        inorder(node, 0);
        System.out.println();

        postorder(node, 0);
        System.out.println();

    }

    public static boolean checkEmpty(String str){
        if(str.equals(".")){
            return false;
        } else {
            return true;
        }
    }

    public static void preorder(ArrayList<ArrayList<Integer>> node, int start){
        int now = start;
        StringBuilder sb = new StringBuilder();

        System.out.printf("%s", (char)(now+'A'));
        for(int data : node.get(now)){
            if(data != -1) {
                preorder(node, data);
            }
        }
    }

    public static void inorder(ArrayList<ArrayList<Integer>> node, int start){
        int now = start;

        if(node.get(now).get(0) != -1) {
            inorder(node, node.get(now).get(0));
        }

        System.out.printf("%s", (char)(now+'A'));

        if(node.get(now).get(1) != -1) {
            inorder(node, node.get(now).get(1));
        }
    }

    public static void postorder(ArrayList<ArrayList<Integer>> node, int start) {
        int now = start;

        if(node.get(now).get(0) != -1) {
            postorder(node, node.get(now).get(0));
        }

        if(node.get(now).get(1) != -1) {
            postorder(node, node.get(now).get(1));
        }

        System.out.printf("%s", (char)(now+'A'));
    }
}