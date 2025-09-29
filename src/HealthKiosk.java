import java.util.Scanner;
public class HealthKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ashesi Health Kiosk.");
        System.out.println("Enter service code (P/L/T/C): ");

        char serviceCode = input.nextLine().toUpperCase().charAt(0);

        switch(serviceCode){
            case 'P': System.out.println("Go to : Pharmacy Desk"); break;
            case 'L': System.out.println("Go to: Lab Desk"); break;
            case 'T':
                System.out.println("Go to: Triage Desk");
                System.out.println("Enter health metric, 1 for BMI, 2 for Dosage round-up, 3 for simple trig helper: ");
                byte healthMetric = input.nextByte();
                switch(healthMetric){
                    case 1: System.out.println("Enter weight (kg): ");
                        double weight = input.nextDouble();
                        System.out.println("Enter height (m): ");
                        double height = input.nextDouble();
                        double bmi = weight/(height*height);
                        double roundBmi = Math.round(bmi * 10) / 10.0;
                        if(roundBmi>=30)
                            System.out.println("BMI: "+roundBmi+"   Category: Obese");
                        else if (roundBmi>25.0)
                            System.out.println("BMI: "+roundBmi+"   Category: Overweight");
                        else if (roundBmi>18.5)
                            System.out.println("BMI: "+roundBmi+"   Category: Normal");
                        else
                            System.out.println("BMI: "+roundBmi+"   Category: Underweight");
                        break;
                    case 2: System.out.println("Enter the required dosage (mg): ");
                        double dosage = input.nextDouble();
                        int tablets = (int)Math.ceil(dosage/250);
                        System.out.println("The number of tablets for your dosage is " + tablets);
                        break;
                    case 3: System.out.println("Enter an angle in degrees: ");
                        double angle = input.nextDouble();
                        double sinAngle = Math.round((Math.sin(angle)*1000)/1000.0);
                        double cosAngle = Math.round((Math.cos(angle)*1000)/1000.0);
                        System.out.println("Sin of angle: " + sinAngle + " degrees.");
                        System.out.println("Cosine of angle: " + cosAngle + " degrees.");
                        break;
                    default: System.out.println("Invalid health metric.");
                }
                break;
            case 'C': System.out.println("Go to: Counseling Desk"); break;
            default: System.out.println("Invalid service code.");
        }

        char randomLetter = (char)('A' + Math.random() * (26));
        int randomNumber1 = (int) (3 + Math.random() * (7));
        int randomNumber2 = (int) (3 + Math.random() * (7));
        int randomNumber3 = (int) (3 + Math.random() * (7));
        int randomNumber4 = (int) (3 + Math.random() * (7));
        String id =  (""+ randomLetter + (char)randomNumber1 + (char)randomNumber2 +(char)randomNumber3 + (char)randomNumber4);

        if (id.length() == 5 ){
            if (Character.isLetter(id.charAt(0))){
                if (Character.isDigit(id.charAt(1)) && Character.isDigit(id.charAt(2)) && Character.isDigit(id.charAt(3)) && Character.isDigit(id.charAt(4))) {
                    System.out.println("ID OK");
                }
                else{
                     System.out.print("Last 4 character must be digits.");
                    }
            }
            else{
                System.out.println("Fist character must be a letter");
            }
        }
        else {
            System.out.print("Invalid length.");
        }

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        char baseCode = Character.toUpperCase(firstName.charAt(0));
        System.out.println("Base code: "+ baseCode);
        char shiftedLetter = (char)('A' + (baseCode - 'A' + 2) % 26);
        System.out.println("Shifted letter: " + shiftedLetter);
        String lastTwo = id.substring(3,4);
        System.out.println("Last two characters for ID: " + lastTwo);




    }
}

