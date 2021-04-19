public class Generator2 {

    public static String text (int size){
        String chars = "-0123456789";
        int min = 1;
        int max = chars.length()-1;

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 6 ; i++) {
            int index;
            // losowanie znaku pojedynczego
            if (i !=2){
            index =(int)Math.floor(Math.random() * (max - min + 1)) + min;}
            else index = 0;
            char c = chars.charAt(index);
            // System.out.print(c);
            text.append(c);
        }
        return text.toString();
    }

}
