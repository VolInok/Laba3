import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Float> polynom1 = new HashMap<>();
        HashMap<Integer, Float> polynom2 = new HashMap<>();
        HashMap<Integer, Float> polynom_sum = new HashMap<>();
        int pow1, pow2, pow3;
        System.out.println("Степень первого многочлена: ");
        pow1 = sc.nextInt();
        for (int i = pow1; i >= 0; i--) {
            System.out.println("Коэффициент " + (i) +"-го одночлена:");
            polynom1.put(i, sc.nextFloat());
            if(polynom1.get(i) == null){
                polynom1.put(i,0f);
            }
        }

        System.out.println("Введите степень второго многочлена:");
        pow2 = sc.nextInt();
        for (int i = pow2; i >= 0; i--) {
            System.out.println("Введите коэффициент " + (i) + "-го одночлена");
            polynom2.put(i, sc.nextFloat());
            if(polynom2.get(i)==null){
                polynom2.put(i,0f);
            }
        }

        if(pow1>pow2) {
            pow3 = pow1;
        }
        else{
            pow3=pow2;
            }
        for(int i = pow3; i>=0; i--){
            if(polynom1.get(i)==null){
                polynom1.put(i,0f);
            }
            else if(polynom2.get(i)==null){
                polynom2.put(i,0f);
            }
            polynom_sum.put(i,(polynom1.get(i)+polynom2.get(i)));
            }

        System.out.println("Первый многочлен: "+PrintPolynomial(polynom1));
        System.out.println("Второй многочлен: "+PrintPolynomial(polynom2));
        System.out.println("Их сумма: "+PrintPolynomial(polynom_sum));
        }
        public static String PrintPolynomial(HashMap<Integer,Float> polynom){
        String num="";
        for(int i = polynom.size()-1; i>=0; i--){
            if(i==0){
                if(polynom.get(i)!=0f){
                    num+= polynom.get(i);
                }
            } else if(i==1){
                if(polynom.get(i)!=0f){
                    num+= polynom.get(i)+"a"+"+";
                }
            } else{
                if(polynom.get(i)!=0f){
                    num+= polynom.get(i)+"a^"+i+"+";
                }
            }
        }
        if(num=="")
            num="0";
        return num;
        }
}
