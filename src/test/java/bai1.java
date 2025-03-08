import com.example.ph56146_tranthingan.TinhTong;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bai1 {
    TinhTong tt = new TinhTong();
    @Test
    public void testTinhTongThanhCong() {
        Assertions.assertEquals(14, tt.TinhTongSoChan(new int[]{2, 4, 6, 8, 12}));
    }

    @Test
    public void TinhTongNgoaiLe() {
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class, () -> tt.TinhTongSoChan(new int[]{})
        );
        Assertions.assertEquals("Mảng không được rỗng", ext.getMessage());

    }

    @Test
    public void testTinhTongAm() {
        Assertions.assertEquals(-10, tt.TinhTongSoChan(new int[]{-2, -6, -8}));
    }

    @Test
    public void testTinhTongBoSoChiaHet6() {
        Assertions.assertEquals(20, tt.TinhTongSoChan(new int[]{2, 6, 8, 12, 10}));
    }

    @Test
    public void testTinhTongSo0() {
        Assertions.assertEquals(0, tt.TinhTongSoChan(new int[]{1, 3, 5, 7}));
    }


}