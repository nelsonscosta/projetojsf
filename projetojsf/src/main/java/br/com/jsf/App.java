package br.com.jsf;

import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persistence.createEntityManagerFactory("projetojsf");
    }
}
