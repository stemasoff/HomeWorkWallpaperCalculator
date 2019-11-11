import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WallpaperCalculator {
    private int lengthRoom;
    private int widthRoom;
    private int heightRoom;
    private int lengthWallpaperRoll;
    private int widthWallpaper;
    private int additionalStock;
    private boolean raport;
    private int raportValue;
    private String numberSystem = "centimeter";
}
