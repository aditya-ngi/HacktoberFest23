public class StringBufferExample {
    public static void main(String[] args) {

        //insert at end
        StringBuffer str = new StringBuffer("test");
        System.out.println(str);
        str.insert(4, "123");
        System.out.println(str);

        //insert in between
        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.insert(3, "123");
        System.out.println(sb);

        //reverse
        StringBuffer str1 = new StringBuffer("hello");
        str1.reverse();
        System.out.println(str1);

        //replace
        StringBuffer str2 = new StringBuffer("Hello world!");
        str2.replace(6,11,"Java");
        System.out.println(str2);

        //capacity
        StringBuffer str3 = new StringBuffer();
        System.out.println(str3.capacity());

        //ensure capacity
        StringBuffer str4 = new StringBuffer();
        str4.ensureCapacity(32);
        System.out.println(str4.capacity());




    }

}
