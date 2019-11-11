public class WallpaperCalculatorService {
    private int perimeter;
    private int amountWallpaperPanels;
    private int amountStrip;
    private int calculateRolls;
    private int lengthOneStrip;

    public int calculate(WallpaperCalculator parametersForCalculation) {
        perimeter = (parametersForCalculation.getLengthRoom() + parametersForCalculation.getWidthRoom()) * 2;
        amountWallpaperPanels = perimeter / parametersForCalculation.getWidthWallpaper() + 1;

        if (parametersForCalculation.isRaport() == false) {
            amountStrip = parametersForCalculation.getLengthWallpaperRoll()
                    / (parametersForCalculation.getHeightRoom() + parametersForCalculation.getAdditionalStock());

        }
        else {
            lengthOneStrip = parametersForCalculation.getHeightRoom() / parametersForCalculation.getRaportValue() + 1;
            amountStrip = parametersForCalculation.getLengthWallpaperRoll()
                    / (lengthOneStrip * parametersForCalculation.getRaportValue());
        }

        calculateRolls = amountWallpaperPanels / amountStrip;
        return calculateRolls;
    }
}
