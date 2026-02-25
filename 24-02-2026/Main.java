/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyDesignPattern;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {

        Internet internet = (Internet) new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("facebook.com");
        internet.connectTo("stackoverflow.com");
    }
}
