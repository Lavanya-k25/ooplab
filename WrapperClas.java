public class WrapperClas {

    public static void main(String[] args) {

        
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing: int to Integer
        System.out.println("Autoboxed Integer: " + wrapperInt);

        Integer aWrapperInt = 50;
        int aPrimitiveInt = aWrapperInt; // Unboxing: Integer to int
        System.out.println("Unboxed int: " + aPrimitiveInt);

        
    }
}