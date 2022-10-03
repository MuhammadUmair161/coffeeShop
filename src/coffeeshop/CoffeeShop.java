package coffeeshop;

import java.util.Scanner;


public class CoffeeShop {
    public static void main(String[] args) {
        //        title
        System.out.println("============================================");
        System.out.println("=============== Coffee Shop ================");
        System.out.println("============================================");
        System.out.println("");
        //        globle varables          
        String decision = "Y";  
        String billing = "Y";  
        do{
            //        globle varables          
            float largeMug = 200;
            float mediumMug = 150;
            float smallMug = 100;
            boolean menu = true;
            Scanner scan = new Scanner(System.in);
            String choise;
            int largeQty = 0;
            int mediumQty = 0;
            int smallQty = 0;
            do {
            //        menu
                while(menu){
                    System.out.println("=================== Menu ===================");
                    System.out.println("");
                    System.out.println("Large Coffee Mug Rs "+largeMug);
                    System.out.println("Medim Coffee Mug Rs "+mediumMug);
                    System.out.println("Small Coffee Mug Rs "+smallMug);
                    menu = false;
                }
                //      enter choise
                System.out.println("");
                System.out.println("========== Enter relevent key  =============");
                System.out.println("======= Accoding to your Choice ============");
                System.out.println("");
                System.out.println("Press 1 For Large Coffee Mug");
                System.out.println("Press 2 For Medim Coffee Mug");
                System.out.println("Press 3 For Small Coffee Mug");
                System.out.println("");
                System.out.println("============================================");
                System.out.print("Enter your Choice-> ");
                choise = scan.nextLine();
                System.out.println("============================================");
                System.out.println("");
                switch (choise) {
                    case "1" -> largeQty +=1;
                    case "2" -> mediumQty +=1;
                    case "3" -> smallQty +=1;
                    default -> {
                        System.out.println("Enter Invaled Choise");
                        System.out.println("");
                    }
                }
                //      decision
                    System.out.println("Do You Want Another Coffee ?");
                    System.out.println("Enter Y For Yes OR N For No");
                    System.out.println("");
                System.out.println("============================================");
                    System.out.print("Enter Decison-> ");
                    decision = scan.nextLine();
                System.out.println("============================================");
            } while (decision.equals("Y")|decision.equals("y"));
            //  bill
                System.out.println("");
                System.out.println("================= Bill =====================");
                System.out.println("--------------------------------------------");
                System.out.println(" Sno.-----Coffee-----Qty-----Priec-----Bill ");
                System.out.println("  1  ---- Large ---- "+largeQty+" --- "+largeMug+" --- "+(largeQty*largeMug)+" ");
                System.out.println("  2  ---- Large ---- "+mediumQty+" --- "+mediumMug+" --- "+(mediumQty*mediumMug)+" ");
                System.out.println("  3  ---- Large ---- "+smallQty+" --- "+smallMug+" --- "+(smallQty*smallMug)+" ");
                System.out.println("------------------------------------");
                System.out.println("     Total                           "+((largeQty*largeMug)+(mediumQty*mediumMug)+(smallQty*smallMug))+" ");
                System.out.println(" -------------------------------------------");
                System.out.println("============================================");
            //      Cancel Your Odder
                System.out.println("If You Want Cancel Your Odder");
                System.out.println("");
                System.out.println("Enter Y | Otherwise N");
                System.out.println("============================================");
                System.out.print("Enter Decison-> ");
                billing = scan.nextLine();
            System.out.println("============================================");
        } while (billing.equals("Y")|billing.equals("y"));
        System.out.println("Bill has been printed");
        System.out.println("============================================");
        System.out.println("================ Thank You =================");
        System.out.println("============================================");

        
        
    }   
}
