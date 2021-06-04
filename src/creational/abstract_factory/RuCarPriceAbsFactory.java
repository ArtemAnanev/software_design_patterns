package creational.abstract_factory;

import creational.abstract_factory.cars.Ferrari;
import creational.abstract_factory.cars.InteAbsFactory;
import creational.abstract_factory.cars.Lada;
import creational.abstract_factory.cars.Porshe;
import creational.abstract_factory.cars.ru.RuFerrariImpl;
import creational.abstract_factory.cars.ru.RuLadaImpl;
import creational.abstract_factory.cars.ru.RuPorsheImpl;

public class RuCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new RuLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new RuPorsheImpl();
    }
}
