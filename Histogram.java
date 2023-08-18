public class Histogram {
    private int [] section;
    private String input;
    public Histogram(){
        section = new int [10];
    }
    public void run(String i){
        input = i;
        int index = 0;
        for (int id = 0;id<input.length();id++){
            index = Integer.parseInt(input.substring(id,id+1));
            section[index]= section[index]+1;
        }
        System.out.println(i);
    }
    public String toString(){
        String result = "";
        for(int i = 0; i<section.length;i++){
            result +=i+" - "+section[i]+" \n";
        }
        return result;
    }
}
