package Spring.OutdoorApp.Logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class CaloriesCalculatorTest {

    @Test
    @DisplayName("should return `Uzupełnij wszystkie pola` if weight and timeMin are less or equal zero")
    void calculateCalories_weight_is_equal_zero() {

        //given
        var timeMin = 20;
        //and
        var weight = 0;
        //and
        var calories = 100;
        //sat
        var toTest = new CaloriesCalculator(timeMin, weight, calories);
        //when
        var exception = catchThrowable(() -> toTest.calculateCalories());
        //then
        assertThat(exception).isInstanceOf(IllegalStateException.class).hasMessageContaining("Uzupełnij wszystkie pola");
    }

    @Test
    @DisplayName("should return calculations if weight and timeMin are greater than zero")
    void calculateCalories_weight_and_timeMin_are_greater_than_zero() {

        //given
        var caloriesCalculator = new CaloriesCalculator(100, 50, 20);


        //sat
        var toTest = caloriesCalculator.calculateCalories();
        //when + then
        assertThat(toTest).isEqualTo("27,78");
    }

}