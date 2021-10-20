public class Operators {
    public static void main(String[] args) {
        int var;
        //unary operator
        int num = 5;
        num++;
        int num2 = -3;
        System.out.println("num = "+num+", num2 =" + num2 );
        boolean  bln = !true;
        // arithmetic operators
        int mul = num * num2;
        int div = num / num2;
        int mod = num%num2;
        int add = num + num2;
        int sub = num - num2;
        System.out.println("mul = "+mul+", div =" + div+", mod = "+mod+", add =" + add +", sub = "+sub );
        // shift operators
        int num3 =6;
        num3 = num3>>2;
        int num4 = num3<<5;
        System.out.println("num3 = "+num3+", num4 =" + num4);

        //Relational operators
        int var1 = 5, var2 = 10, var3 = 5;
        System.out.println("var1 == var2: " + (var1 == var2));
        System.out.println("var1 == var3: " + (var1 == var3));
        System.out.println("var1 == var2: " + (var1 != var2));
        System.out.println("var1 > var2: " + (var1 > var2));
        System.out.println("var1 >= var2: " + (var1 <= var2));

        //Bitwiese
        System.out.println("var1 & var2: " + (var1 & var2));
        System.out.println("var1 | var2: " + (var1 | var2));
        System.out.println("var1 ^ var2: " + (var1 ^ var2));

        // Logical
        int a = 10, b = 20, c = 20, d = 0;
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("This is &&(And) block The sum is: " + d);
        }
        else
            System.out.println("False conditions");
        if ((a < b) || (b == c)) {
            d = a + b + c;
            System.out.println("This is ||(OR) block The sum is :" + d);
        }
        else
            System.out.println("False conditions");

        //Ternary Operators
        int n1 = 5, n2 = 10, max;
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Maximum is = " + max);

        //Assingment operators
        int var4;
        String name;
        num = 10;
        name = "GeeksforGeeks";
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);



    }
}
