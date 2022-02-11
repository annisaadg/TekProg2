package soalOperators1;

/**
 * The soalOperators1 program converts a double (float) data
 * type into a byte 
 * @author Annisa Dinda
 * @version 1.0
 * @since 2022-02-11
 */
class soalOperators1
{
    /**
     * @param l  This is the paramter to methodOne method
     * @return byte This returns convert of d and f.
     */
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
