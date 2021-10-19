public class countTo10 {
    public static void main(String args[]) {
        try{
            Thread.sleep(30000);
            for (int i = 1; i <= 10; i++) {
                System.out.println(
                    i
                );
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }

    }
}