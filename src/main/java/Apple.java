import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apple {
    private AppleType type;
    private String variety;
    private double price;


}
