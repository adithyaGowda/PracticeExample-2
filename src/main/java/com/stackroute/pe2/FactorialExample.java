package com.stackroute.pe2;

public class FactorialExample {

    public String printIntFactorials()
    {
        int i  = 1;
        int fact = 1;
        System.out.println("Int factorials:");
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
            if (Integer.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact = fact * i;
        }
        return "Int factorials";
    }

    public String printLongFactorials()
    {
        long i  = 1L;
        long fact = 1L;
        System.out.println("Long factorials:");
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
            if (Long.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact = fact * i;
        }
        return "Long factorials";
    }
}
