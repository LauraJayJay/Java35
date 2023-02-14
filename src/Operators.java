public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x % 76;
        System.out.println(x);

        //Assigment operators =, -=, +=, *=, /=
        int a = 10;
        a = 20;
        a += 20;
        System.out.println(a);
        a *= 20;
        System.out.println(a);


        //INCREMENTATION OPERATORS & DECREMENTAL OPERATORS

        int i = 10;
        i++;
        ++i;
        System.out.println(i);

        int e = 10;
        e--;
        --e;
        System.out.println(e);

        //Post - incrementation

        int num1 = 10;
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1);

        //Pre - incrementation

        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2++);
        System.out.println(num2);

        // 4 ways to increment by one
        num1 = num1 + 1;
        num1 += 1;
        num1++;
        ++num1;


        //Relation operators

        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println(p==k);
        System.out.println("Equality " + (p==k));


        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than > and greater or equal to >=
        System.out.println("Greater than " + (p>k));
        System.out.println("Greater than or equal to " + (p>=k));

        //Less than < and less or equal to <=
        System.out.println("Less than " + (p<k));
        System.out.println("Less than or equal " + (p<=k));

        //LOGICAL OPERATORS
        //Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " + (sun && dry));

        System.out.println((p>k) && (p>=k));

        int bobsAge = 8;
        int johnsAge = 9;
        int annasAge = 10;

        //Is John is older then Bob and younger then Anna?
        System.out.println( (johnsAge > bobsAge) && (johnsAge < annasAge) );

        //Logical OR - ||
        boolean sale = true;
        boolean ritch = true;

        System.out.println("I will buy iPhone " + (sale || ritch));

        //Negation
        boolean example = true;
        System.out.println(!example);







    }
}
