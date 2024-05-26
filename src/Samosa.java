public class Samosa {
    private static Samosa samosa;
    private Samosa(){
        if(samosa != null){
            throw new RuntimeException("You are trying to break Singleton design");
        }
    }

    public  static Samosa getSamosa(){
         if(samosa == null){
             synchronized (Samosa.class){
                 if(samosa == null){
                     samosa = new Samosa();
                 }
             }
         }
        return samosa;
    }
}
