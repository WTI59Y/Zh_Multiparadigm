public class PropToYml
{
    public static void main( String[] args )
    {
        String[] inputProperty = {"hu.uni.eszterhazy.log-level=INFO","hu.uni.eszterhazy.log-file=/tmp/all.log"};
        for(String currentProperty : inputProperty) {
            currentProperty = currentProperty.replace("="," : ");
            String[] splitted = currentProperty.split("\\.");

            for (int i = 0; i < splitted.length; i++) {
                System.out.println();
                for (int j = 0; j < i; j++) {
                    System.out.print("    ");
                }
                System.out.print(splitted[i]);
            }
        }
    }

}
