/**
 * This is just a demo for static methods, static nested classe, static access modifiers etc..,
 * anything static will be dealt
 * @author enomoha
 *
 */
public class StaticDemo {


    private StaticHelper staticHelperObj;
    private StaticHelperToHelper StaticHelperToHelperObj;


 public static class StaticHelper{

     private StaticDemo StaticDemoObj;
    }


 private static class StaticHelperToHelper
 {
     private StaticDemo StaticDemoObj;
 }

}

