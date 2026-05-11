public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
//        Forma explicita
        Integer intObjeto = Integer.valueOf(intPrimitivo);
//        Forma implicita, autoboxing
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
//        Forma implicita, autoboxing
        System.out.println("num = " + num);
//        Forma explicita
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
