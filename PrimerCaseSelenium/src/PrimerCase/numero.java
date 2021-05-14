package PrimerCase;

public class numero {
    public static void main(String[] args) {

        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[0]);

        }catch (Exception e){

            System.out.println(e);
            throw e;
        }



    }
}
