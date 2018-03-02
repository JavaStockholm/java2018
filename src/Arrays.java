

public class Arrays {

    double numb1;
    double numb2;
    double numb3;
    double numb4;

    public static void calculateAvrage(double numb1, double numb2, double numb3, double numb4) {

        double sum = numb1 + numb2 + numb3 + numb4;
        double avrage = sum / 4;

        System.out.println(avrage);
    }
   
    public static void calculateAvrage(double numb1, double numb2, double numb3) {

        double sum = numb1 + numb2 + numb3;
        double avrage = sum / 4;

        System.out.println(avrage);
    }
   
    
    public static void main(String[] args) {
   
        Arrays.calculateAvrage(3, 5, 6, 80);
        Arrays.calculateAvrage(3, 5, 6);
    }

}


