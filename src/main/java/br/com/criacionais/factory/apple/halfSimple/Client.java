package br.com.criacionais.factory.apple.halfSimple;

import br.com.criacionais.factory.apple.halfSimple.enums.LevelIPhone;
import br.com.criacionais.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.criacionais.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.criacionais.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.criacionais.factory.apple.halfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone(LevelIPhone.STANDARD);
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone(LevelIPhone.HIGHEND);
        System.out.println(iphone2);
    }
}
