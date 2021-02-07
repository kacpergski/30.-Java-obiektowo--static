public class Generator {
    public static String text (int size){
        String chars = "abcdefghijksdflkvnlskdfhslmnopqrstuwxyz";
        int min = 0;
        int max = chars.length()-1;

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size ; i++) {

            // losowanie znaku pojedynczego
           int index =(int)Math.floor(Math.random() * (max - min + 1)) + min;

            char c = chars.charAt(index);
           // System.out.print(c);
         text.append(c);
        }
       return text.toString();
    }
}
