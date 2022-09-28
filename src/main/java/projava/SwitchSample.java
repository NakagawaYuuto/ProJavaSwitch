package projava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 3;
//        System.out.println( switch (a) {
//           case 1, 2 -> "one-two";
//           case 3 -> "tree";
//           case 4 -> "four";
//            default -> "other";
//        });
        switch (a){
            case 1,2 -> System.out.println("one-two");
            case 3 -> System.out.println("tree");
            case 4 -> System.out.println("four");
            default -> System.out.println("other");
        }
        switch (a) {
            case 1:
            case 2:
                System.out.println("one-two");
                break;
            case 3:
                System.out.println("tree");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
                break;
        }
        System.out.println(switch (a){
            case 1:
            case 2: yield "one-two";
            case 3: yield "tree";
            case 4: yield "four";
            default: yield "other";
        });
    }
}
