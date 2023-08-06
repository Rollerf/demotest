package com.rollerfdeveloper.demotest.service;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MainServiceTest {
    @Test
    public void setIdNestServiceIfIdIsGreaterThanCero() {
        int id = 3;

        // Hacer un mock de una clase dentro de la clase a testear
        NestService nestService = mock(NestService.class);

        // Instanciamos la clase que queremos testear
        MainService mainService = new MainService();

        // Setteamos el mock dentro de la clase a testear
        mainService.setNestService(nestService);

        // Llamamos al metodo que queremos testear
        mainService.setIdNestService(id);

        // Usar verify de mockito para testear si el metodo fue invocado
        // .setId(id) testea que el parametro elegido fue id
        verify(nestService, times(1))
                .setId(id);
    }

    @Test
    public void noSetIdNestServiceIfIdIsSmallerThanOne() {
        int id = 0;

        // Hacer un mock de una clase dentro de la clase a testear
        NestService nestService = mock(NestService.class);

        // Instanciamos la clase que queremos testear
        MainService mainService = new MainService();

        // Setteamos el mock dentro de la clase a testear
        mainService.setNestService(nestService);

        // Llamamos al metodo que queremos testear
        mainService.setIdNestService(id);

        // Usar verify de mockito para testear si el metodo fue invocado
        // .setId(anyInt()) testea que nunca fue invocado con cualquier parametro
        verify(nestService, never())
                .setId(anyInt());
    }
}
