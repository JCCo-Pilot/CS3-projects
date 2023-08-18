public class Fibonacci{
    private String input;
    private int [] sequence;
    public Fibonacci(String i){
        input = i;
        int size = Integer.parseInt(i.substring(0,i.indexOf(" ")));
        sequence = new int [size];
        input = input.substring(i.indexOf(" ")+1);
        fill();
    }
    public String answer() {
        String result = "";
        while (!input.isEmpty()) {
            int spaceIndex = input.indexOf(" ");
            if (spaceIndex == -1) {
                spaceIndex = input.length();
            }
    
            int term = Integer.parseInt(input.substring(0, spaceIndex));
            int value = getTermValue(term);
            result += value + "\n";
    
            input = input.substring(spaceIndex).trim();
        }
        return result;
    }
    public String toString(){
        String result = "";
        for (int i = 0; i<sequence.length;i++){
            result += sequence[i]+" ";
        }
        return result;
    }
    public void fill(){
        if(sequence.length>0){
            sequence[0]= 1;
        }
        if (sequence.length>1){
            sequence[1] = 1;
        }
        for (int i = 2; i<sequence.length;i++){
            sequence [i]= sequence [i-1]+sequence[i-2];
        }
    }
    public int getTermValue(int term) {
        if (term >= 1 && term <= sequence.length) {
            return sequence[term - 1];
        } else {
            return -1;
        }
    }
}