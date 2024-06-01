public class App {
    private final static String ERROR_COLOR = "\u001B[31m";
    private final static String DEFAULT_COLOR = "\u001B[0m";
    
    public static void main(String[] args) throws Exception {
        System.out.println(DecToBin(0));
    }


    /**
     * Decimal to binary converter
     * @param num, number INT
     * @return INT number converted to binary
     */
    
    public static String DecToBin(int num) {
        if(num < 0){
            throw new IllegalArgumentException(ERROR_COLOR + "\"num\" must be positive !" + DEFAULT_COLOR);
        }
        
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int numMod = num % 2;

            switch (numMod) {
                case 0:
                    sb.append("0");
                    break;
                case 1:
                    sb.append("1");
                    break;
            }

            num = Math.round(num / 2);
        }

        sb.append("b0");
        return sb.reverse().toString();
    }
}
