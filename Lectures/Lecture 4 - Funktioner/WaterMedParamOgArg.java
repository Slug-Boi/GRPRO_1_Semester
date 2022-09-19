class WaterMedParamOgArg {
    static double water(double weight){
            double amount = 35;
        double result = weight * amount;
        double result_liters = result / 1000;
        return result_liters;
        }
        
        
    
    static void call(double weightA, double weightB) {
       double amountA = water(weightA);
       double amountB = water(weightB);
       if(amountA > amountB) {
           System.out.println(amountA);
       } else {
          System.out.println(amountB); 
       }
    }
   
}