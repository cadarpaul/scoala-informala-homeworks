/**
 * Created by ILIE on 5/23/2018.
 */
public class Main {

    public static void main(String[] args) {

        SalesRepresentative[] reps = new SalesRepresentative[5];
        reps[0]= new SalesRepresentative("John",10,500);
        reps[1]= new SalesRepresentative("Maria",7,800);
        reps[2]= new SalesRepresentative("Madalin",9,700);
        reps[3]= new SalesRepresentative("Andrei",5,500);
        reps[4]= new SalesRepresentative("Flaviu",6,900);

        printNameSales(sortArray(reps));
    }

    public static SalesRepresentative[] sortArray (SalesRepresentative[] val) {
        int n = val.length;
        SalesRepresentative temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(val[j-1].getProd() < val[j].getProd()){
                    temp = val[j-1];
                    val[j-1] = val[j];
                    val[j] = temp;
                }
            }
        }
        return val;
    }

    public static void printNameSales (SalesRepresentative[] val) {
        for (int i=0; i < val.length; i++) {
            System.out.println(val[i].totalSales());
        }
    }
}
