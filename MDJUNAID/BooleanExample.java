public class BooleanExample {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isCodingEasy = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is coding easy? " + isCodingEasy);

        // Boolean operations
        boolean resultAnd = isJavaFun && isCodingEasy; // logical AND
        boolean resultOr = isJavaFun || isCodingEasy; // logical OR
        boolean resultNot = !isJavaFun; // logical NOT

        System.out.println("Java fun AND Coding easy? " + resultAnd);
        System.out.println("Java fun OR Coding easy? " + resultOr);
        System.out.println("Is Java not fun? " + resultNot);
    }
}
