package br.com.criacionais.factory.apple.after.factory;

import br.com.criacionais.factory.apple.after.model.IPhone;
import br.com.criacionais.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    public IPhone createIPhone() {
        return new IPhone11();
    }

}
