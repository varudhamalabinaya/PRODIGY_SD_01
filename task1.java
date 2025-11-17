    import java.util.*;
    class task1{
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            double temperature;
            char unit;
            System.out.print("Enter the temperature:");
            temperature=sc.nextDouble();
            System.out.print("Enter the unit of that temperature:");
            unit=sc.next().charAt(0);
            if(unit=='C' || unit=='c'){
                System.out.println("Temperature in Fahrenheit is:"+(temperature*9/5+32));
                System.out.println("Temperature in Kelvin is:"+(temperature+273.15));
            }
            else if(unit=='F' || unit=='f'){
                System.out.println("Temperature in Celsius is:"+((temperature-32)*5/9));
                System.out.println("Temperature in Kelvin is:"+((temperature-32)*5/9+273.15));
            }
        else  if(unit=='K' || unit=='k'){
                System.out.println("Temperature in Celsius is:"+(temperature-273.15));
                System.out.println("Temperature in Fahrenheit is:"+((temperature-273.15)*9/5+32));
            }
            else{
                System.out.print("Try again w67ith a valid unit C/F/K");
            }
        }
    }