package Spring.OutdoorApp.Logic;

import Spring.OutdoorApp.model.ActivityData;
import Spring.OutdoorApp.model.ActivityRepository;
import Spring.OutdoorApp.model.CaloriesRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class RequirementsServiceTest {

    @Test
    @DisplayName("should return not empty set")
    void createCaloriesData_returns_list_of_calories_same_size_as_activity_list() {
        //given
        var mockActivityData = new ActivityData();
        //and
        var activityList = mockActivityData.ActivityData();
        //and
        var mockActivityRepository = mock(ActivityRepository.class);
        //and
        var mockCaloriesRepository = mock(CaloriesRepository.class);
        //sat
        var toTest = new RequirementsService(mockActivityRepository, mockCaloriesRepository, mockActivityData);
        //when
        var result = toTest.createCaloriesData(mockActivityData.ActivityData());
        //then
        assertThat(result.size()).isEqualTo(activityList.size());
    }

}