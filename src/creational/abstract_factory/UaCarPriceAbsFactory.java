package creational.abstract_factory;

import creational.abstract_factory.cars.Ferrari;
import creational.abstract_factory.cars.InteAbsFactory;
import creational.abstract_factory.cars.Lada;
import creational.abstract_factory.cars.Porshe;
import creational.abstract_factory.cars.ua.UaFerrariImpl;
import creational.abstract_factory.cars.ua.UaLadaImpl;
import creational.abstract_factory.cars.ua.UaPorsheImpl;

public class UaCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }

    @Override
    public Lada getLada() {
        return new UaLadaImpl();

    }
}
