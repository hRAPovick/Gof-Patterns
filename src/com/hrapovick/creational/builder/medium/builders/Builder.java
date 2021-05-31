package com.hrapovick.creational.builder.medium.builders;

import com.hrapovick.creational.builder.medium.cars.CarType;
import com.hrapovick.creational.builder.medium.components.Engine;
import com.hrapovick.creational.builder.medium.components.GPSNavigator;
import com.hrapovick.creational.builder.medium.components.Transmission;
import com.hrapovick.creational.builder.medium.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
