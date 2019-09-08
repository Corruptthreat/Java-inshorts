public class DictionaryDpk{
    public static void main(String args[]) throws Exception{
        java.util.Scanner scan  = new java.util.Scanner(System.in);
        String [][]dictionary = new String[20][3];
        String word_1[] = {"Java" ,"Java is an object oriented progrmming language and is secure" , "*"};
        String word_2[] = {"Ant" ,"Small creature" , null};
        String word_3[] = {"Zebra" ,"Animal with stripes" , null};
        String word_4[] = {"Mobile" ,"An electronic device" , "*"};
        String word_5[] = {"Nose" ,"One of the sense organ of human body" , null};
        String word_6[] = {"Cpp" ,"Programming language" , null};
        dictionary[0] = word_1 ; dictionary[1] = word_2 ; dictionary[2] = word_3 ; dictionary[3] = word_4 ; dictionary[4] = word_5 ; dictionary[5] = word_6 ;
        
        Thread.sleep(1000);
        System.out.print("Loading your Dictionary please wait!");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        System.out.println("");
        for(int data_traverse = 1; data_traverse<=dictionary.length;data_traverse++){
            String row[]  = dictionary[data_traverse-1]; 
			   String key=row[0];
			   if(key==null)break;
			   
			   String def=row[1];
			   String favorit=row[2];
			   
			   System.out.printf("%3s ",favorit==null?"":favorit);
			   System.out.printf("%-20s ",key);
			   System.out.printf("%-100s",def);
			   System.out.print("\n\n");
        }
        String user_input;
        String user_input2;
        while(true){
            System.out.println("Enter 'A' to search desired word");
            System.out.println("Enter 'B' to add a new word");
            System.out.println("Enter 'C' to show your favourite word");
            System.out.println("Enter 'D' to remove a word");
            user_input = scan.next();

            switch(user_input){
                case "A" : 
                           System.out.println("Enter the word.");
                           user_input2 = scan.next();
                           for(int data_traverse = 1; data_traverse<=dictionary.length;data_traverse++){
                            String row[]  = dictionary[data_traverse-1]; 
                               String key=row[0];
                               if(key==null)break;
                               String def=row[1];
                               String favorit=row[2];
                               
                               System.out.printf("%3s ",favorit==null?"":favorit);
                               System.out.printf("%-20s ",key);
                               System.out.printf("%-100s",def);
                               System.out.print("\n\n");
                        }

                }
            }
        }
       
    }


}
