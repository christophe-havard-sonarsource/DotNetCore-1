package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DisplayTruc();
    }

    public static void DisplayTruc(){
        int[] tab = new int[10];
        for(int i = 0; i <= 10; i++){// this should provoque NPE
            System.out.println( tab[i] );
        }
    }
    public static void DisplayAnotherTruc(){
        int[] tab = new int[10];
        for(int i = 0; i <= 10; i++){// this should provoque NPE
            System.out.println( tab[i] );
        }
    }

}
