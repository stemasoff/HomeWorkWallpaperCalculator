import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperCalculatorServiceTest {

    @Test
    void calculate() {
        WallpaperCalculator parametersForCalculation = new WallpaperCalculator();
        WallpaperCalculatorService calculator = new WallpaperCalculatorService();

        parametersForCalculation.setLengthRoom(500);
        parametersForCalculation.setWidthRoom(600);
        parametersForCalculation.setWidthWallpaper(106);
        parametersForCalculation.setLengthWallpaperRoll(1_000);
        parametersForCalculation.setHeightRoom(275);
        parametersForCalculation.setAdditionalStock(10);
        parametersForCalculation.setRaport(true);
        parametersForCalculation.setRaportValue(30);

        assertEquals(7, calculator.calculate(parametersForCalculation));

    }
}