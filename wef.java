public class wef {
    public static void main(String[] args) {
        //String qa="wfbqwyeubfqwiuebfyqw";
        String qa="hello;everyone;;good;morning";

        char[] arrChar = qa.toCharArray();

        qa.getChars(0,7,arrChar,3);

        String newStrV1 = "" + 30;


        int newStrVO = Integer.valueOf("5050");
        System.out.println(newStrVO);
        qa.substring(3);
//        String newStr = qa.subSequence(3,6);

        String[] arr = qa.split(";");
        String str3 = null;
       // qa=qa.replace("-----","daaa");
        qa=qa.replaceAll("-y+","/");
        System.out.println(qa);
    }

}
