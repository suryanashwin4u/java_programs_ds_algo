class SplitString{
    public static void main(String []args){
        String strMain = "Java,C,Python,Perl";
        String[] arrSplit = strMain.split(",");
        for (int i=0; i < arrSplit.length; i++)
        {
            System.out.println(arrSplit[i]);
        }
    }
}