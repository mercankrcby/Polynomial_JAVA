
package hw09_mercan_karacabey_131044034;



public class HW09_MERCAN_KARACABEY_131044034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /**
         * birinci denklemin derecesi ikincisinden buyukse
         */
        double sayilar[]={1,-1,2,3};
        double sayilar2[]={1,1,1};
        Polynom test = new Polynom(sayilar,4);
        System.out.println(test);
        
        Polynom test2 = new Polynom(sayilar2,3);
        System.out.println(test2);
        
        System.out.println("Addition");
        System.out.println("\n"+test.sumPolynom(test2));
        System.out.println("Difference");
        System.out.println("\n"+test.subsPolynom(test2));
        System.out.println("Multiply");
        System.out.println("\n"+test.cross(test2));
        System.out.println("If Equations equal return true ,not false");
        System.out.println("Are equals ?");
        System.out.println("\n"+test.equals(test2));
        
        
        /**
         * her ikisinin derecesi de esitse ve bir denklemin katsayilarinin tamami 0'sa
         */
        double sayilar1[]={0,0,0};
        double sayilar3[]={3,4,5};
        Polynom test1=new Polynom(sayilar1,3);
        System.out.println(test1);
        
        Polynom test3= new Polynom(sayilar3,3);
        System.out.println(test3);
        
        System.out.println("Addition");
        System.out.println("\n"+test1.sumPolynom(test3));
        System.out.println("Difference");
        System.out.println("\n"+test1.subsPolynom(test3));
        System.out.println("Multiply");
        System.out.println("\n"+test1.cross(test3));
        System.out.println("If Equations equal return true ,not false");
        System.out.println("Are equals?");
        System.out.println("\n"+test1.equals(test3));
        
        /**
         * her ikisi de ayni dereceye sahip ve ayni katsayi degerlerine sahipse
         */
        double sayilarEsit[]={3,3,3,3,3};
        double sayilarEsitDiger[]={3,3,3,3,3};
        Polynom testEsit=new Polynom(sayilarEsit,5);
        System.out.println(testEsit);
        
        Polynom testEsitDiger=new Polynom(sayilarEsitDiger,5);
        System.out.println(testEsitDiger);
        
        System.out.println("Addition");
        System.out.println("\n"+testEsit.sumPolynom(testEsitDiger));
        System.out.println("Difference");
        System.out.println("\n"+testEsit.subsPolynom(testEsitDiger));
        System.out.println("Multiply");
        System.out.println("\n"+testEsit.cross(testEsitDiger));
        System.out.println("If Equations equal return true ,not false");
        System.out.println("Are equals?");
        System.out.println("\n"+testEsit.equals(testEsitDiger));
        
        /**
         * İkinci Polinomun derecesi birincisinden buyukse
         */
        double sayilar5[]={3,3,3};
        double sayilar6[]={1,2,3,4,5};
        Polynom test5=new Polynom(sayilar5,3);
        System.out.println(testEsit);
        
        Polynom test6=new Polynom(sayilar6,5);
        System.out.println(testEsitDiger);
        
        System.out.println("Addition");
        System.out.println("\n"+test5.sumPolynom(test6));
        System.out.println("Difference");
        System.out.println("\n"+test5.subsPolynom(test6));
        System.out.println("Multiply");
        System.out.println("\n"+test5.cross(test6));
        System.out.println("If Equations equal return true ,not false");
        System.out.println("Are equals?");
        System.out.println("\n"+test5.equals(test6));
        
        
        /**
         * Negatif Sayilar Icin
         */
        double sayilar7[]={-3,3,-3};
        double sayilar8[]={1,-2,3,-4,5};
        Polynom test7=new Polynom(sayilar7,3);
        System.out.println(testEsit);
        
        Polynom test8=new Polynom(sayilar8,5);
        System.out.println(test8);
        
        System.out.println("Addition");
        System.out.println("\n"+test7.sumPolynom(test8));
        System.out.println("Difference");
        System.out.println("\n"+test7.subsPolynom(test8));
        System.out.println("Multiply");
        System.out.println("\n"+test7.cross(test8));
        System.out.println("If Equations equal return true ,not false");
        System.out.println("Are equals?");
        System.out.println("\n"+test7.equals(test8));
        
        
        
        
    }
    
}
