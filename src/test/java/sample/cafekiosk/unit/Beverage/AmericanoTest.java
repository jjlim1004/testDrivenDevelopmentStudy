package sample.cafekiosk.unit.Beverage;

import org.junit.jupiter.api.Test;

import java.awt.print.Pageable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();

        //junit api
        //assertEquals(americano.getName(),"아메리카노");

        //assertJ api
        //assertJ 검증이 더 보기 좋고, 메서드 체이닝도 가능해서 더 좋다.
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();

        //junit api
        //assertEquals(americano.getName(),"아메리카노");

        //assertJ api
        //assertJ 검증이 더 보기 좋고, 메서드 체이닝도 가능해서 더 좋다.
        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}